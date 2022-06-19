package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class RestControl {

@Autowired
JpaRepo repo;
	
@GetMapping("/")	
String showpage() {
	return "signup";}


	
@PostMapping("/savedata")	
String showpage1(@ModelAttribute MyModal model) {
	
	repo.save(model);
	
	
	
	System.out.println(model.toString());
	

	
	return "savedata";}

//@ModelAttribute
//public void addAttributes(Model model) {
//    model.addAttribute("msg", "Welcome to the Netherlands!");
//}
	
}
