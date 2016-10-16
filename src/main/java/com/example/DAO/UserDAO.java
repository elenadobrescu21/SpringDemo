package com.example.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Entity.*;


@Repository
public class UserDAO {
	
	private static ArrayList<User> users;
	
	 static {

	      users  = new ArrayList<User>();
	      users.add(new User(1, "Dobrescu Elena", "abcd"));
	      users.add(new User(2, "Udrea Marius", "blabla"));
	    }

	public static ArrayList<User> getUsers() {
		return users;
	}

	public static void setUsers(ArrayList<User> users) {
		UserDAO.users = users;
	}
	
	 public void removeUuser(int id) {
		 users.remove(id);
	 }
	 
	 public User getUser(int id) {
		return users.get(id); 
	 }
	 
	 public void insertUser(User user) {
		 users.add(user);
	 }

}
