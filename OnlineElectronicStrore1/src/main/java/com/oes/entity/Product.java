package com.oes.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OEProduct")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	//@NotNull(message = "Username cannot be Null")
		@Size(min = 2,message = "ProductName is not valid, should have more than 2 characters")
	private String productName;
	private int cost;
	private int  brandName;
	private String category;
	LocalDate DateOfLaunch;
	
	public Product(String productName, int cost, int brandName, int rating, String category, LocalDate dateOfLaunch) {
		super();
		this.productName = productName;
		this.cost = cost;
		this.brandName = brandName;
		this.category = category;
		DateOfLaunch = dateOfLaunch;
	}
	
	
}