package com.priceservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.priceservice.dto.ProductDTO;
import com.priceservice.model.Product;
import com.priceservice.model.ProductDiscount;
import com.priceservice.repository.ProductDiscountRepository;
import com.priceservice.service.ProductService;

/**
 * The ProductServiceImpl class.
 * 
 * @author cracker
 * @since 2021
 */
@Service
public class ProductServiceImpl implements ProductService {

	/** The product discount repository. */
	@Autowired
	private ProductDiscountRepository productDiscountRepository;

	/**
	 * Insert new product.
	 *
	 * @param productDTO the product DTO
	 * @return status
	 */
	@Override
	@Transactional
	public String createProduct(ProductDTO productDTO) {

		Product product = new Product();
		product.setProductName(productDTO.getProductName());
		product.setCartonPrice(productDTO.getCartonPrice());
		product.setUnitPerCarton(productDTO.getUnitPerCarton());

		ProductDiscount productDiscount = new ProductDiscount();
		productDiscount.setDiscount(productDTO.getDiscount());
		productDiscount.setNoOfCartons(productDTO.getNoOfCartons());
		productDiscount.setProduct(product);

		ProductDiscount result = productDiscountRepository.save(productDiscount);
		return "Success";
	}

}
