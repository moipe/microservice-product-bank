package com.nttdata.bank.product.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "products")
public class Product {
	
	@Id
	private String _id;
	
	private String name;
	
	private String type;
	
	private String category;
	
	private Double commission;

}
