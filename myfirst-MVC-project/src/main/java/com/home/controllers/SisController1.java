package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController1 {
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeUp() {
		return "Take the make up kit!";
		
	}

	
	@ResponseBody
	@RequestMapping("/book")
	public String getBooks() {
		return "This are the books your requested for";
		
	}
}
