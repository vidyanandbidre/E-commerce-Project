package com.Ecommercewebsite.helper;

import org.springframework.beans.BeanUtils;

import com.Ecommercewebsite.Model.Credential;
import com.Ecommercewebsite.dto.CredentialDto;
import com.Ecommercewebsite.dto.UserDto;

public interface CredentialMappingHelper {
	public static CredentialDto map(Credential credential) {

		CredentialDto credentialDto = new CredentialDto();
		BeanUtils.copyProperties(credential, credentialDto);
		
		if(credential.getUser() != null) {
			UserDto userDto = new UserDto();
			BeanUtils.copyProperties(credential.getUser(), userDto);
			credentialDto.setUserDto(userDto);
		}
		return credentialDto;
	}
}