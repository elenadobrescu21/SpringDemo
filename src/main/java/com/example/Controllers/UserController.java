package com.example.Controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.UserService;
import com.example.Entity.*;


@RestController
@RequestMapping("/users")
public class UserController {
	
	 @Autowired
	    private UserService userService;

	    @RequestMapping(method = RequestMethod.GET)
	    public ArrayList<User> getAllUsers(){
	        return userService.getAllUsers();
	    }

	    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	    public User getStudentById(@PathVariable("id") int id){
	        return userService.getUser(id);
	    }

	    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	    public void deleteUser(@PathVariable("id") int id){
	        userService.removeUser(id);
	    }

	    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void insertStudent(@RequestBody User user){
	        userService.insertUser(user);
	    }

}
