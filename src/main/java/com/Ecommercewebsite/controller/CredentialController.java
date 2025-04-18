package com.Ecommercewebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommercewebsite.dto.CredentialDto;
import com.Ecommercewebsite.service.CredentialServiceImpl;

//Spring Data REST 
@RestController
@RequestMapping("/api/credentials")
public class CredentialController {

		@Autowired
		private CredentialServiceImpl credentialServiceImpl;
		
		@GetMapping("username/{uname}")
		public ResponseEntity<CredentialDto> findByUserName(@PathVariable("uname") String username) {
			CredentialDto result = credentialServiceImpl.findByUsername(username);
			return ResponseEntity.ok(result);		
		}
			
		
}
