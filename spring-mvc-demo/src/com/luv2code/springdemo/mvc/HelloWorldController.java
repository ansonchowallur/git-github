package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

//import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude( HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		model.addAttribute("message","Yo! " + theName);
		
		return "helloWorld";
		
	}
	
		@RequestMapping("/processFormVersionThree")
		public String processFormVersionThree(@RequestParam("studentName") String theName,Model model ) {
			
			
			theName = theName.toUpperCase();
			
			model.addAttribute("message","Hey! " + theName);
			
			return "helloWorld";	
		
		}
			
	
	
}
