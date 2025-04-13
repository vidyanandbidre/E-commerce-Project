package com.Ecommercewebsite.service;

import java.util.List;

import com.Ecommercewebsite.dto.UserDto;

public interface UserService {

	UserDto save(UserDto userDto);
	UserDto findById(Integer userId);
	List<UserDto>findall();
	UserDto update(Integer userId,UserDto userDto);
	void deleteById(Integer userId);
	UserDto findByUsername(String username);
	
	
}
