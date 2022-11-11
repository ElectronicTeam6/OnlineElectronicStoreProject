package com.oes.util;

import org.apache.catalina.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.oes.dto.UserDefaultResponseDTO;
import com.oes.dto.UserReviewCreatedResponseDTO;
import com.oes.entity.Review;

@Component
@Scope("singleton")
public class UserDTOConvertor {

	public static UserDefaultResponseDTO  getUserDefaultDTO(User user)
	{
		UserDefaultResponseDTO dto = new UserDefaultResponseDTO(
				                 user.getUsername(), 
				                 user.getUserId(), 
				                 user.getUserProfile().getEmail(),
				                 "User Profile Created , Profile Id : "+user.getUserProfile().getProfileId());
		
		return dto;
	}
	
	
	
	
	public static UserReviewCreatedResponseDTO getPostCreatedDTO(User user,Review review)
	{
		UserReviewCreatedResponseDTO dto = new UserPostCreatedResponseDTO(
				 user.getUsername(), 
                 user.getUserId(), 
                 review.getDescription(),
                 "Review Added "+review.getDate()
                 );
				 
				 return dto;
	}

}
