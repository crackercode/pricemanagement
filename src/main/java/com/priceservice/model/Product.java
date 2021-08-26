package com.priceservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The Product Entity class.
 * 
 * @author Chamara Kendaragama
 * @since 2021
 */
@Entity
@Table(name = "product")
public class Product {

	/**
	 * The id long
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	/**
	 * The productName String
	 */
	private String productName;

	/**
	 * The cartonPrice double
	 */
	private double cartonPrice;

	/**
	 * The unitPerCarton long
	 */
	private long unitPerCarton;

	@OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private ProductDiscount productDiscount;

	/**
	 * Get id
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
	 * Get productName
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
	 * Get cartonPrice
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
	 * Get unitPerCarton
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
	 * Get productDiscount
	 *
	 * @return the productDiscount
	 */
	public ProductDiscount getProductDiscount() {
		return productDiscount;
	}

	/**
	 * Set productDiscount.
	 *
	 * @param productDiscount the productDiscount to set
	 */
	public void setProductDiscount(ProductDiscount productDiscount) {
		this.productDiscount = productDiscount;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", cartonPrice=" + cartonPrice
				+ ", unitPerCarton=" + unitPerCarton + "]";
	}
}
