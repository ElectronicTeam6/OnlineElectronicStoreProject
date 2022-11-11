package com.oes.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OEReview")
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String reviewId;
	private String userName;
	private String productName;
	private String title;
	private String description;
	private int rating;
	private LocalDate date;
	
	public Review(String userName, String productName, String title, String description, int rating, LocalDate date) {
		super();
		this.userName = userName;
		this.productName = productName;
		this.title = title;
		this.description = description;
		this.rating = rating;
		this.date = date;
	}

	
}
