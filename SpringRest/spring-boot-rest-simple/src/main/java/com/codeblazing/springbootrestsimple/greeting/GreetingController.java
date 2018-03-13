package com.codeblazing.springbootrestsimple.greeting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: Arek Czarnoglowski
 * @created: 13.03.2018 00:08
 * @version: 1.0
 */
@RestController
public class GreetingController {

	private static final String contentTemplate = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(path = "/greeting", method = RequestMethod.GET)
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Dupa") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(contentTemplate, name));
	}
}
