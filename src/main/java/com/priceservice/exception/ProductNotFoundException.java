package com.priceservice.exception;

/**
 * The ProductNotFoundException class
 * 
 * @author Chamara Kendaragama
 * @since 2021
 */
public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(String message) {
		super(message);
	}

}
