package com.codeblazing.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author: Arek Czarnoglowski
 * @created: 18.03.2018 21:35
 * @version: 1.0
 */
@RestController
public class MyRestController {

	@RequestMapping("/")
	public String greetings() {
		return "Hello from Spring Boot Rest Controller!";
	}
}
