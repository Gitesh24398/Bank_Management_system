package com.bank.services;

import java.util.List;

import com.bank.entity.Accounts;
import com.bank.entity.User;

public interface UserDetails {
	public User addUser(User user);
	public void deleteUser(int id);
	public List<User> allUser();
	public User updateUser(User user);
//	public Accounts getUserbyAccountno(int accountnumber);
}
