package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.User;
import com.bank.services.UserDetails;

@RestController
@RequestMapping("/bank")
public class UserController {
	@Autowired
	private UserDetails userdetails;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return userdetails.addUser(user);
	}
	
	@GetMapping("/users")
	public List<User> allUser(){
		return userdetails.allUser();
	}
}
