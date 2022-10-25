package com.priceservice.exception;

/**
 * The ProductNotFoundException class
 * 
 * @author cracker
 * @since 2021
 */
public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(String message) {
		super(message);
	}

}
