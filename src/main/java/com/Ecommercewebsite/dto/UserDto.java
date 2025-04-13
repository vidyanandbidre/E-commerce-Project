package com.Ecommercewebsite.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;




public class UserDto {

	private Integer userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	@JsonProperty("credential")
	@JsonInclude(value=Include.NON_NULL)
	private CredentialDto credentialDto;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public CredentialDto getCredentialDto() {
		return credentialDto;
	}

	public void setCredentialDto(CredentialDto credentialDto) {
		this.credentialDto = credentialDto;
	}

	public UserDto(Integer userId, String firstName, String lastName, String email, String phone,
			CredentialDto credentialDto) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.credentialDto = credentialDto;
	}

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
