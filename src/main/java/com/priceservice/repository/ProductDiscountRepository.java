package com.priceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priceservice.model.ProductDiscount;

/**
 * The ProductDiscountRepository interface.
 * 
 * @author cracker
 * @since 2021
 */
public interface ProductDiscountRepository extends JpaRepository<ProductDiscount, Long> {

}
