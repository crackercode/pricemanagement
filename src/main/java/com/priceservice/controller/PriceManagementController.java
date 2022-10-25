package com.priceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.priceservice.dto.ProductDTO;
import com.priceservice.service.PriceManagementService;
import com.priceservice.service.ProductService;

/**
 * Price management service rest controller
 * 
 * @author cracker
 * @since 2021
 */
@RestController
@RequestMapping("/priceservice")
public class PriceManagementController {

	/**
	 * The priceManagementService PriceManagementService
	 */
	@Autowired
	private PriceManagementService priceManagementService;

	/**
	 * The productService ProductService
	 */
	@Autowired
	private ProductService productService;

	/**
	 * Get unit price
	 * 
	 * @param productName
	 * @return single unit price
	 */
	@GetMapping("/unitPrice")
	public ResponseEntity<Double> getUnitPrice(@RequestParam String productName) {
		return ResponseEntity.ok().cacheControl(CacheControl.noCache())
				.body(priceManagementService.getUnitPrice(productName));
	}

	/**
	 * Get units price
	 * 
	 * @param productName
	 * @return price of units
	 */
	@GetMapping("/unitsPrice")
	public ResponseEntity<Double> getUnitsPrice(@RequestParam String productName, @RequestParam long noOfUnits) {
		return ResponseEntity.ok().cacheControl(CacheControl.noCache())
				.body(priceManagementService.getUnitsPrice(productName, noOfUnits));
	}

	/**
	 * Create new product
	 * 
	 * @param product
	 * @return status
	 */
	@PostMapping("/product")
	public ResponseEntity<String> addProduct(@RequestBody ProductDTO productDTO) {
		return ResponseEntity.ok().cacheControl(CacheControl.noCache()).body(productService.createProduct(productDTO));
	}

}
