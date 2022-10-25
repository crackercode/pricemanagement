package com.priceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priceservice.model.Product;

/**
 * The ProductRepository interface.
 * 
 * @author cracker
 * @since 2021
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

	/**
	 * Assumption : product name is unique.
	 * 
	 * @return Product object
	 */
	Product findByProductName(String productName);

}
