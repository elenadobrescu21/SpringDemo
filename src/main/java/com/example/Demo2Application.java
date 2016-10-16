package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

import com.example.DAO.UserDAO;
import com.example.Entity.User;

@SpringBootApplication
public class Demo2Application {
	
	private static final Logger log = LoggerFactory.getLogger(Demo2Application.class);

	public static void main(String[] args) {
//		ApplicationContext context = new FileSystemXmlApplicationContext("E:/spring workspace/demo2/src/main/resources/spring.xml");
//		Hello helloWorld = (Hello) context.getBean("helloWorld");
//		
//		System.out.println(helloWorld.getMessage());
//		
//		Student student = (Student) context.getBean("student");
//		
//		System.out.println("Name: " + student.getName());
//		System.out.println("ID: " + student.getId());
//		
//		RestTemplate restTemplate = new RestTemplate();
//        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//        log.info(quote.toString());
//        System.out.println(quote.getValue().getQuote());
		
//		SpringApplication.run(Demo2Application.class, args);
		
		ApplicationContext context =
	    		new FileSystemXmlApplicationContext("E:/spring workspace/demo2/src/main/resources/Spring-module.xml");
		
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
        User user = new User(1, "Popescu","oooo");
        userDAO.insert(user);
		
	}
}
