package com.camel.routing.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamelController {

	@RequestMapping(value = "/")
	public String startCamel() {
		return "Sample data";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void postCamel(@RequestBody User user) {
		System.out.println("ASD" + user);
	}
}
