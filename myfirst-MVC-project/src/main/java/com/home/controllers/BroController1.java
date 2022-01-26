package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController1 {
	
	@ResponseBody
	@RequestMapping("/cricketbat")
	public String getCricetBat() {
		return "I have your Cricket bat here it is!";
		
	}

}
