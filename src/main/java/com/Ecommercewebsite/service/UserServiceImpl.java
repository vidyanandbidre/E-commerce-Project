package com.Ecommercewebsite.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommercewebsite.Model.Credential;
import com.Ecommercewebsite.Model.User;
import com.Ecommercewebsite.Repo.UserRepository;
import com.Ecommercewebsite.dto.CredentialDto;
import com.Ecommercewebsite.dto.UserDto;
import com.Ecommercewebsite.helper.CredentialMappingHelper;
import com.Ecommercewebsite.helper.UserMappingHelper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto save(UserDto userDto) {

		User user = UserMappingHelper.map(userDto);
		User dbUser = userRepository.save(user);
		UserDto result = UserMappingHelper.map(dbUser);

		return result;
	}

	@Override
	public UserDto findById(Integer userId) {

		return userRepository.findById(userId).map(UserMappingHelper::map)
				.orElseThrow(() -> new RuntimeException("User not found"));
	}

	@Override
	public List<UserDto> findall() {

		return userRepository.findAll().stream().sorted(Comparator.comparing(User::getUserId))
				.map(UserMappingHelper::map).collect(Collectors.toList());
	}

	@Override
	public UserDto update(Integer userId, UserDto userDto) {

		User user = new User();
		BeanUtils.copyProperties(userDto, user);

		Credential credential = new Credential();
		BeanUtils.copyProperties(userDto.getCredentialDto(), credential);

		user.setCredential(credential);

		return userDto;
	}

	@Override
	public void deleteById(Integer userId) {

		userRepository.deleteById(userId);

	}

	@Override
	public UserDto findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDto findByCredentialUsername(String username) {
		try {
			Optional<User> optional = userRepository.findByCredentialUsername(username);
			return optional.map(UserMappingHelper::map).orElseThrow(() -> new RuntimeException("Username not found"));
		} catch (Exception e) {
			throw new RuntimeException("Something went wrong while fetching user by credential username", e);
		}
	}

}
