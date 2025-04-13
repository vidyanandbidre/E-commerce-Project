package com.Ecommercewebsite.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommercewebsite.Model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
