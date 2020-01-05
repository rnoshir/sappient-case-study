package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ProductDetails;

@RestController
@RequestMapping("/product")
public class ProductDetailsController {

	@Autowired
	ProductDetails productDetails;
	
	@GetMapping("/product-details")
	public ResponseEntity<?> getProductDetails(@Nullable @RequestParam("groupBy") String groupBy) {
		return ResponseEntity.ok().body(productDetails.getProductDetails(groupBy));
	}
}
