package com.codeblazing.configuration;

import com.codeblazing.domain.RestAPIClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Arek Czarnoglowski
 * @created: 14.03.2018 13:23
 * @version: 1.0
 */
@Configuration
public class DomainConfigToImport {

	@Bean
	public RestAPIClient restAPIClient (@Qualifier("restApiObjectMapper") ObjectMapper objectMapper) {
		return new RestAPIClient("restAPIClient", objectMapper);
	}

	@Bean
	@Qualifier("restApiObjectMapper")
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
}
