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
	
		/* TYPE */
	//1 - Ahorro
	//2 - Cuenta corriente
	//3 - Plazo fijo
	//4 - Tarjeta de crédito
	private Byte type;
	
		/* CATEGORY */
	//1 - Pasivo
	//2 - Activo
	//3 - VIP
	//4 - PYME
	private Byte category;
	
	private String description;
	
	private Float commissionMaintenance;
	
	private Byte maxTransactions;
	
	private Float commissionTransaction;
}
