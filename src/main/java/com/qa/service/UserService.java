package com.qa.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.qa.persistance.entity.User;

@Service
public interface UserService {
	
	Collection<User> getAllUsers();
	User getUser(Long id);
	String deleteUser(User user);
	User addUser(User User);

}
