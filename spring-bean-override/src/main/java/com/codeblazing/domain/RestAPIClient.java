package com.codeblazing.domain;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author: Arek Czarnoglowski
 * @created: 14.03.2018 13:24
 * @version: 1.0
 */
public class RestAPIClient {

	private final String beanFunction;
	private final ObjectMapper objectMapper;

	public RestAPIClient(String beanFunction, ObjectMapper objectMapper) {
		this.beanFunction = beanFunction;
		this.objectMapper = objectMapper;
	}

	public String getBeanFunction() {
		return beanFunction;
	}

	public ObjectMapper getObjectMapper() {
		return objectMapper;
	}
}
