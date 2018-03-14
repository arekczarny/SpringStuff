package com.codeblazing.domain;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author: Arek Czarnoglowski
 * @created: 14.03.2018 13:26
 * @version: 1.0
 */
public class InternalProcessor {

	private final String beanFunction;
	private final RestAPIClient restAPIClient;
	private final ObjectMapper objectMapper;

	public InternalProcessor(String beanFunction, RestAPIClient restAPIClient, ObjectMapper objectMapper) {
		this.beanFunction = beanFunction;
		this.restAPIClient = restAPIClient;
		this.objectMapper = objectMapper;
	}

	public String getBeanFunction() {
		return beanFunction;
	}

	public RestAPIClient getRestAPIClient() {
		return restAPIClient;
	}

	public ObjectMapper getObjectMapper() {
		return objectMapper;
	}
}
