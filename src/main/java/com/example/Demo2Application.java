package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Hello helloWorld = (Hello) context.getBean("helloWorld");
		
		System.out.println(helloWorld.getMessage());
		
		Student student = (Student) context.getBean("student");
		
		System.out.println("Name: " + student.getName());
		System.out.println("ID: " + student.getId());
		
	}
}
