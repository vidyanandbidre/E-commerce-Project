package com.Ecommercewebsite.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommercewebsite.Model.Credential;
import com.Ecommercewebsite.Repo.CredentialRepository;
import com.Ecommercewebsite.dto.CredentialDto;
import com.Ecommercewebsite.helper.CredentialMappingHelper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CredentialServiceImpl {

	@Autowired
	private CredentialRepository credentialRepositry;

	public CredentialDto findByUsername(String username) {
		Optional<Credential> optional = credentialRepositry.findByUsername(username);
		if (optional.isPresent()) {

			Credential dbCredential = optional.get();
			return CredentialMappingHelper.map(dbCredential);

		} else {
			throw new RuntimeException("UserName not found");
		}

	}

}
