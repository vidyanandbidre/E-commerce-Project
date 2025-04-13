package com.Ecommercewebsite.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Ecommercewebsite.Repo.UserRepository;
import com.Ecommercewebsite.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	@Override
	public UserDto save(UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto findById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> findall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto update(Integer userId, UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDto findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
