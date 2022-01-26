package com.home.mycafe.controllers;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	
	//returns the welcome view page
	@RequestMapping("/cafe")
	public String showWelcomePage() {
		
		return "welcome-page";
		
	}
	
	
	
	@RequestMapping("/processOrder")
	public String processOder(HttpServletRequest request,Model model) {
		//handle the data received from the user
		String userEnteredValue = request.getParameter("foodType");
		
		//add the captured value to the model
		model.addAttribute("userInput", userEnteredValue);
		
		
		//set the user data to the model object and send it to the view
		return "process-order";
	}

}
