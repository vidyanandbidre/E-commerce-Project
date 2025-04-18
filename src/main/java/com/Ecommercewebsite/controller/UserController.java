package com.Ecommercewebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Ecommercewebsite.dto.UserDto;
import com.Ecommercewebsite.service.UserService;
import com.Ecommercewebsite.service.UserServiceImpl;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/users")
@Slf4j
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
	 @Autowired
	 private UserServiceImpl userServiceImpl;

	@PostMapping
	public ResponseEntity<UserDto> save(@RequestBody @Valid UserDto userDto) {
		UserDto dbUser = userService.save(userDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(dbUser);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> findById(@PathVariable Integer userId) {
		log.info("UserController :: fetch user details");
		return ResponseEntity.ok(userService.findById(userId));
	}

	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> update(@PathVariable Integer userId,@RequestBody UserDto userDto){
		log.info("UserController :: update");
		return ResponseEntity.ok(userService.update(userId, userDto));
		
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<Boolean> delete(@PathVariable Integer userId){
		log.info("UserController :: Delete");
		userService.deleteById(userId);
		return ResponseEntity.ok(true);
	}
	
	 @GetMapping("/username/{uname}")
	    public ResponseEntity<UserDto> findByUserName(@PathVariable("uname") String username) {
	        UserDto result = userServiceImpl.findByCredentialUsername(username); // ✅ Correct usage
	        return ResponseEntity.ok(result);
	    }
}
