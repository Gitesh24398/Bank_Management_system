package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bank.entity.Accounts;
import com.bank.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>  {
	

}
