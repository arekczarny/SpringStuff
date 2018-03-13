package com.codeblazing.springbootrestsimple.greeting;

/**
 * @author: Arek Czarnoglowski
 * @created: 13.03.2018 00:06
 * @version: 1.0
 */
public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
