package com.priceservice.service;

/**
 * The PriceManagementService interface.
 * 
 * @author Chamara Kendaragama
 * @since 2021
 */
public interface PriceManagementService {

	/**
	 * Get single unit price.
	 * 
	 * @param productName
	 * @return price
	 */
	double getUnitPrice(final String productName);

	/**
	 * Get units price
	 * 
	 * @param productName
	 * @param noOfUnits
	 * @return price
	 */
	double getUnitsPrice(final String productName, final long noOfUnits);

}
