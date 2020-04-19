package com.example.demo;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepo;

@SpringBootApplication
public class SpringThymeLeafDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringThymeLeafDemoApplication.class, args);
	}

	
	@Autowired
	UserRepo userRepo;
	
	@PostConstruct
	private void createUser()
	{
		java.sql.Date date=new java.sql.Date(1993, 06, 19);
		User user=new User("Cheryl","password","cj4783@gmail.com",123.0,date);
		userRepo.save(user);
	}
}
