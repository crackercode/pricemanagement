package com.priceservice.dto;

/**
 * The Product Entity class.
 * 
 * @author Chamara Kendaragama
 * @since 2021
 */
/**
 * @author ASUS
 *
 */
public class ProductDTO {

	/** The id long. */
	private long id;

	/** The productName String. */
	private String productName;

	/** The cartonPrice double. */
	private double cartonPrice;

	/** The unitPerCarton long. */
	private long unitPerCarton;

	/** The discount String. */
	private double discount;

	/** The noOfCartons String. */
	private int noOfCartons;

	/**
	 * Get id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Set id.
	 *
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Get productName.
	 *
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Set productName.
	 *
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Get cartonPrice.
	 *
	 * @return the cartonPrice
	 */
	public double getCartonPrice() {
		return cartonPrice;
	}

	/**
	 * Set cartonPrice.
	 *
	 * @param cartonPrice the cartonPrice to set
	 */
	public void setCartonPrice(double cartonPrice) {
		this.cartonPrice = cartonPrice;
	}

	/**
	 * Get unitPerCarton.
	 *
	 * @return the unitPerCarton
	 */
	public long getUnitPerCarton() {
		return unitPerCarton;
	}

	/**
	 * Set unitPerCarton.
	 *
	 * @param unitPerCarton the unitPerCarton to set
	 */
	public void setUnitPerCarton(long unitPerCarton) {
		this.unitPerCarton = unitPerCarton;
	}

	/**
	 * Gets the discount.
	 *
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * Sets the discount.
	 *
	 * @param discount the new discount
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	/**
	 * Gets the no of cartons.
	 *
	 * @return the no of cartons
	 */
	public int getNoOfCartons() {
		return noOfCartons;
	}

	/**
	 * Sets the no of cartons.
	 *
	 * @param noOfCartons the new no of cartons
	 */
	public void setNoOfCartons(int noOfCartons) {
		this.noOfCartons = noOfCartons;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", productName=" + productName + ", cartonPrice=" + cartonPrice
				+ ", unitPerCarton=" + unitPerCarton + ", discount=" + discount + ", noOfCartons=" + noOfCartons + "]";
	}

}
