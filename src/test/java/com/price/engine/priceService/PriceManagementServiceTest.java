package com.price.engine.priceService;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.priceservice.model.Product;
import com.priceservice.model.ProductDiscount;
import com.priceservice.repository.ProductRepository;
import com.priceservice.service.impl.PriceManagementServiceImpl;

/**
 * The PriceManagementServiceTest class.
 * 
 * @author Chamara Kendaragama
 * @since 2020
 */
@RunWith(MockitoJUnitRunner.class)
public class PriceManagementServiceTest {

	@Mock
	ProductRepository productRepository;

	@InjectMocks
	PriceManagementServiceImpl PriceManagementServiceImpl;

	Product product = null;
	ProductDiscount productDiscount = null;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);

		product = new Product();
		productDiscount = new ProductDiscount();
		productDiscount.setNoOfCartons(3);

		product.setProductName("Penduin-ears");
		product.setUnitPerCarton(20);
		product.setCartonPrice(175.00);
		product.setProductDiscount(productDiscount);
	}

	@Test
	public void testGetUnitsPriceUnits25() {

		double expected = 231.88;

		Mockito.when(productRepository.findByProductName(ArgumentMatchers.anyString())).thenReturn(product);

		double actual = PriceManagementServiceImpl.getUnitsPrice("Penduin-ears", 25);

		assertEquals(expected, actual);
	}

	@Test
	public void testGetUnitsPriceUnits65() {

		double expected = 529.38;

		Mockito.when(productRepository.findByProductName(ArgumentMatchers.anyString())).thenReturn(product);

		double actual = PriceManagementServiceImpl.getUnitsPrice("Penduin-ears", 65);

		assertEquals(expected, actual);
	}

}
