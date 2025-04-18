package com.Ecommercewebsite.helper;

import org.springframework.beans.BeanUtils;

import com.Ecommercewebsite.Model.Credential;
import com.Ecommercewebsite.Model.User;
import com.Ecommercewebsite.dto.CredentialDto;
import com.Ecommercewebsite.dto.UserDto;

public interface UserMappingHelper {

	public static User map(UserDto userDto) {
	    User user = new User();
	    BeanUtils.copyProperties(userDto, user);

	    if (userDto.getCredentialDto() != null) {
	        Credential credential = new Credential();
	        BeanUtils.copyProperties(userDto.getCredentialDto(), credential);

	        // Ensure password is properly set here as well
	        if (userDto.getCredentialDto().getPassword() == null) {
	            throw new IllegalArgumentException("Password cannot be null");
	        }

	        credential.setUser(user);
	        user.setCredential(credential);
	    }

	    return user;
	}



	public static UserDto map(User user) {
		
		if(user == null) {
			return null;
		}
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(user, userDto);
		
		if(user.getCredential() != null) {
			CredentialDto credentialDto = new CredentialDto();
			BeanUtils.copyProperties(user.getCredential(), credentialDto);
			userDto.setCredentialDto(credentialDto);
		
		}
		return userDto;
	}

}
