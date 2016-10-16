package com.example.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.UserDAO;
import com.example.Entity.*;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	public ArrayList<User> getAllUsers() {
		return userDAO.getUsers();
	}
	
	public User getUser(int id) {
		return userDAO.getUser(id);
	}
	
	public void removeUser(int id) {
		userDAO.removeUuser(id);
	}
	
	public void insertUser(User user) {
		userDAO.insertUser(user);
	}

}
