package com.priceservice.service.impl;

import java.text.DecimalFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.priceservice.exception.ProductNotFoundException;
import com.priceservice.model.Product;
import com.priceservice.repository.ProductRepository;
import com.priceservice.service.PriceManagementService;
import com.priceservice.util.ProductUtil;

/**
 * The PriceManagementServiceImpl class.
 * 
 * @author Chamara Kendaragama
 * @since 2021
 */
@Service
public class PriceManagementServiceImpl implements PriceManagementService {

	/** The logger. */
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ProductRepository productRepository;

	/**
	 * Get single unit price.
	 * 
	 * @param productName
	 * @return price
	 */
	@Override
	@Transactional
	public double getUnitsPrice(String productName, long noOfUnits) {

		logger.info("Entering getUnitsPrice method. productName : {} noOfUnits : {}", productName, noOfUnits);

		Product product = productRepository.findByProductName(productName);
		double price = 0;

		try {

			if (noOfUnits > product.getUnitPerCarton()) {
				long remainingUnits = noOfUnits % product.getUnitPerCarton();

				long noOfCartons = Math.round(noOfUnits / product.getUnitPerCarton());

				price = ProductUtil.getUnitPrice(product.getCartonPrice(), product.getUnitPerCarton(), 30)
						* remainingUnits;

				if (noOfUnits / product.getUnitPerCarton() >= product.getProductDiscount().getNoOfCartons()) {
					price = price + noOfCartons * (product.getCartonPrice() * 0.9);
				} else {

					price = price + noOfCartons * product.getCartonPrice();
				}
			} else {
				price = ProductUtil.getUnitPrice(product.getCartonPrice(), product.getUnitPerCarton(), 30) * noOfUnits;
			}

		} catch (NullPointerException ex) {
			logger.error("Product not found : %d", ex);
			throw new ProductNotFoundException("Product Not found.");
		}
		DecimalFormat df2 = new DecimalFormat("###.##");

		return Double.valueOf(df2.format(price));
	}

	/**
	 * Get units price
	 * 
	 * @param productName
	 * @param noOfUnits
	 * @return price
	 */
	@Override
	@Transactional
	public double getUnitPrice(final String productName) {
		Product product = productRepository.findByProductName(productName);
		double unitPrice = 0;

		try {
			DecimalFormat df2 = new DecimalFormat("###.##");
			unitPrice = ProductUtil.getUnitPrice(product.getCartonPrice(), product.getUnitPerCarton(), 30);
			unitPrice = Double.valueOf(df2.format(unitPrice));

		} catch (NullPointerException ex) {
			logger.error("Product not found : %d", ex);
			throw new ProductNotFoundException("Product Not found.");
		}

		return unitPrice;
	}

}
