package com.Ecommercewebsite.Repo;

import com.Ecommercewebsite.Model.Credential; // ✅ correct

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends JpaRepository<Credential, Integer>{

	//DSL Methods 
	//input : String 
	//output : Credential -> Optional or List of Credentials 
	
	Optional<Credential> findByUsername(String username);
	
}
