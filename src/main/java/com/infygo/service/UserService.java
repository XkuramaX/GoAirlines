package com.infygo.service;

//import java.util.ArrayList;
import java.util.List;

import com.infygo.dto.UserDTO;
import com.infygo.model.User;
import com.infygo.rest.objs.LoginForm;

public interface UserService {
	public String addUser(UserDTO user);
	public UserDTO getUser(String id);
	public List<User> getAllUsers();
	public void removeUser(String id);
	public UserDTO updateUser(String id, User newUser);
	public String userLogin(LoginForm login);
}
