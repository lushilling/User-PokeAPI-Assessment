package com.qa.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.qa.persistance.entity.User;
import com.qa.persistance.repository.UserDatabaseRepository;

@Service
public class UserServiceImplemented implements UserService {
	
	private UserDatabaseRepository userRepo;

	public Collection<User> getAllUsers() {
		return userRepo.findAll();
	}

	public User getUser(Long id) {
		User user = userRepo.findById(id).get();
		return user;
	}

	public String deleteUser(User user) {
		userRepo.delete(user);
		return "Account Deleted";
	}

	public User addUser(User user) {
		return userRepo.save(user);
	}

}
