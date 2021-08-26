package com.priceservice.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.priceservice.dto.ResponseVO;

/**
 * The RestGlobalExceptionHandler class
 * 
 * @author Chamara Kendaragama
 * @since 2021
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class RestGlobalExceptionHandler {

	private final Logger logger = LoggerFactory.getLogger(RestGlobalExceptionHandler.class);

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ResponseVO> handleException(ProductNotFoundException ex) {
		logger.error("PriceService : Product not found : ", ex);
		ResponseVO responseVo = ResponseVO.fail(ex.getMessage());
		responseVo.setData(ex.getMessage());
		return new ResponseEntity<>(responseVo, HttpStatus.OK);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResponseVO> handleException(Exception ex) {
		logger.error("PriceService : A system exception thrown from the system : ", ex);
		ResponseVO responseVo = ResponseVO.fail(ex.getMessage());
		responseVo.setData(ex.getMessage());
		return new ResponseEntity<>(responseVo, HttpStatus.OK);
	}

}
