package com.qa.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistance.entity.User;
import com.qa.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@Autowired
	private JmsTemplate jmsTemplate;

	public UserController(UserService service, JmsTemplate jmsTemplate) {
		this.service = service;
		this.jmsTemplate = jmsTemplate;
	}

	public UserController() {
	}

	@GetMapping("/allUsers")
	public Collection<User> getAllUsers() {
		return service.getAllUsers();
	}

	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getUser(@PathVariable Long id) {
		return new ResponseEntity<>(service.getUser(id), HttpStatus.OK);
	}

	@DeleteMapping("/deleteUser")
	public String deleteUser(User user) {
		return service.deleteUser(user);
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		User newUser = service.addUser(user);
		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}
	
}
