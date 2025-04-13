package com.Ecommercewebsite.Repo;

import com.Ecommercewebsite.Model.Credential; // ✅ correct

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends JpaRepository<Credential, Integer>{

}
