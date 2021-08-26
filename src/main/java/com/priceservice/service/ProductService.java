package com.priceservice.service;

import com.priceservice.dto.ProductDTO;

/**
 * The ProductService interface.
 * 
 * @author Chamara Kendaragama
 * @since 2021
 */
public interface ProductService {

	/**
	 * Insert new product
	 * 
	 * @param product
	 * @return status
	 */
	String createProduct(ProductDTO productDTO);

}
