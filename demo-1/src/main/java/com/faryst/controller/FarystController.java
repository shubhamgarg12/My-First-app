package com.faryst.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/m2")
public class FarystController {
	
	@RequestMapping(value = "/register",method = RequestMethod.POST )
	public void registerUser(@RequestBody String pass) {
		
		
		
		
	}

}
