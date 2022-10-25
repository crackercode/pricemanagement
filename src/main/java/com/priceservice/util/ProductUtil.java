package com.priceservice.util;

/**
 * The ProductUtil class.
 * 
 * @author cracker
 * @since 2021
 */
public class ProductUtil {

	private ProductUtil() {
	}

	/**
	 * Calculate unit price.
	 * 
	 * @param cartonPrice
	 * @param noOfUnits
	 * @return unit price
	 */
	public static double getUnitPrice(double cartonPrice, long noOfUnits, double compensate) {

		return ((cartonPrice / noOfUnits) * (100 + compensate) / 100);
	}

}
