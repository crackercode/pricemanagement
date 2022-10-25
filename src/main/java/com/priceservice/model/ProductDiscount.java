package com.priceservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The ProductDiscount Entity class.
 * 
 * @author cracker
 * @since 2021
 */
@Entity
@Table(name = "product_discount")
public class ProductDiscount {

	/**
	 * The id long
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	/**
	 * The discount double
	 */
	private double discount;

	/**
	 * The noOfCartons long
	 */
	private long noOfCartons;

	/**
	 * The product Product
	 */
	@OneToOne
	@MapsId
	private Product product;

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
	 * Get discount
	 *
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * Set discount.
	 *
	 * @param discount the discount to set
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	/**
	 * Get noOfCartons
	 *
	 * @return the noOfCartons
	 */
	public long getNoOfCartons() {
		return noOfCartons;
	}

	/**
	 * Set noOfCartons.
	 *
	 * @param noOfCartons the noOfCartons to set
	 */
	public void setNoOfCartons(long noOfCartons) {
		this.noOfCartons = noOfCartons;
	}

	/**
	 * Get product
	 *
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * Set product.
	 *
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ProductDiscount [id=" + id + ", discount=" + discount + ", noOfCartons=" + noOfCartons + ", product="
				+ product + "]";
	}

}
