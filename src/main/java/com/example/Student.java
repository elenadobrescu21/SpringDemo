package com.example;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	

}
