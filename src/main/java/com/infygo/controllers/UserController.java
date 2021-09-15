package com.infygo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infygo.dto.UserDTO;
import com.infygo.model.User;
import com.infygo.rest.objs.LoginForm;
//import com.infygo.service.UserService;
import com.infygo.service.UserServiceImpl;

@RequestMapping("api/user")
@RestController
public class UserController {
	
	public final UserServiceImpl user;
	
	@Autowired
	public UserController(UserServiceImpl user) {
		this.user = user;
	}
	
	
	@GetMapping
	public List<User> getAllUser(){
		return user.getAllUsers();
	}
	
	@PostMapping
	public String createUser(@RequestBody User newUser) {
		UserDTO userDTO = User.perpareUserDTO(newUser);
		System.out.println(userDTO);
		return user.addUser(userDTO);
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestBody LoginForm login) {
		return user.userLogin(login);
	}
	
}
