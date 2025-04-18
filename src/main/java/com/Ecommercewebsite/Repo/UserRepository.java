package com.Ecommercewebsite.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecommercewebsite.Model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	//fetch userDeatils by username
	//input username 
	//output user
	
	Optional<User> findByCredentialUsername(String username);
	
}
