/**
 * 
 */
package com.priceservice.controller;

import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cracker
 *
 * @since 2022
 */
@RestController
@RequestMapping("/dummyservice")
public class DummyController {
	
	@GetMapping("/dummy")
	public ResponseEntity<String> dummy(){
		return ResponseEntity.ok().cacheControl(CacheControl.noCache())
				.body("Dummy Response ...!!!;");
	}

}
