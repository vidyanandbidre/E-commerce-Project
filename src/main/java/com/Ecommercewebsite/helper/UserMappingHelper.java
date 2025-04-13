package com.Ecommercewebsite.helper;

import org.springframework.beans.BeanUtils;

import com.Ecommercewebsite.Model.Credential;
import com.Ecommercewebsite.Model.User;
import com.Ecommercewebsite.dto.UserDto;

public interface UserMappingHelper {

	public static User map(UserDto userDto) {
		
		User user= new User();
		BeanUtils.copyProperties(userDto, user);
		
		Credential credential= new Credential();
		BeanUtils.copyProperties(userDto.getCredentialDto(), credential);
		
		user.setCredential(credential);
		
	
		
		return null;

	}

	public static UserDto map(User user) {
		return null;
	}

}
