package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/")
	public String helloWorld() {
		return "{\"message\":\"Hello World Java v1\"}";
	}
	@GetMapping(path = "/good-morning")
	public String goodMorning() {
		return "{\"message\":\"Good Morning! Have a great day :)\"}";
	}
}
