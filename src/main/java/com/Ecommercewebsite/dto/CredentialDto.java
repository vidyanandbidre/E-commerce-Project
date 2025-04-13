package com.Ecommercewebsite.dto;

import com.Ecommercewebsite.Model.RoleBasedAuthority;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Builder
@Getter
@Setter
@AllArgsConstructor
public class CredentialDto {

	private Integer credentialId;
	private String username;
	private String password;
	private RoleBasedAuthority roleBasedAuthority;
	private Boolean isEnabled;
	private Boolean isAccountNonExpired;
	private Boolean isAccountNonLocked;
	private Boolean isCredentialsNonExpired;
	
	@JsonProperty("user")
	private UserDto useerDto;
}
