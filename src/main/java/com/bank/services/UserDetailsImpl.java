package com.bank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.bank.entity.Accounts;
import com.bank.entity.User;
import com.bank.repository.UserRepository;

@Service
@EnableJpaRepositories
public class UserDetailsImpl implements UserDetails {

	@Autowired
	private UserRepository repo;
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);;
	}

	@Override
	public List<User> allUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		User u = repo.findById(user.getUserid()).get();
		u.setMobileno(user.getMobileno());
		u.setDateOfBirth(user.getDateOfBirth());
		u.setUsername(user.getUsername());
		return repo.save(u);
	}

//	@Override
//	public Accounts getUserbyAccountno(int accountnumber) {
//		// TODO Auto-generated method stub
//		return repo.getuserbyaccountno(accountnumber);
//	}

}
