package com.nttdata.bank.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bank.product.model.Product;
import com.nttdata.bank.product.service.ProductService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	private Flux<Product> findAll(){
		return productService.findAll();
	}

}
