package com.nttdata.bank.product.service;

import com.nttdata.bank.product.model.Product;

import reactor.core.publisher.Flux;

public interface ProductService {
	
	Flux<Product> findAll();

}
