package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @Controller does same function as @Component. when the WebApplicationContext container reads the
 * spring bean config file(dad-frontcontroller-servlet.xml) and it sees the component scan, it tells spring
 * to search through that path and create an object for any class with @Controller.
 * 
 * @RequestMapping it is the url path for each handler method which the front controller  
 * tells the controller to handle.
 * 
 * @ResponseBody all the response which the handler method returns the @ResponseBody attach it to 
 * a HTTP Response and sends it back to the client.
 */
@Controller
public class MomController1 {

	@RequestMapping("/sugar")
	public String getSugar() {

		return "page1";

	}

}
