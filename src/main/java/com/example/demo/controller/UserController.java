package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repositories.UserRepo;

@Controller
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	UserRepo userRepo;

	@GetMapping("/")
	public String getUserName(Model thymeleafModel)
	{
		thymeleafModel.addAttribute("user", userRepo.findAll().get(0));
//		thymeleafModel.addAttribute("username", "Cheryl");
		thymeleafModel.addAttribute("copyright", "copy right info");
		return "user/ShowUser";
	}
}
