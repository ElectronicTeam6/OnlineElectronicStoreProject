package com.oes.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OEUsers")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String username;
	private String password;
	private String role; 
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "profile")
	private Profile userProfile;
	
//	@ElementCollection
//	@CollectionTable(name = "FBUser_Hobbies")
//	private List<String> hobbies;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Review")
	private List<Review> allReviews;
	
	
	
	public User(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	}
	
	
	
	
