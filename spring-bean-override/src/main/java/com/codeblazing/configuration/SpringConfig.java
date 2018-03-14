package com.codeblazing.configuration;

import com.codeblazing.domain.InternalProcessor;
import com.codeblazing.domain.RestAPIClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: Arek Czarnoglowski
 * @created: 14.03.2018 11:39
 * @version: 1.0
 */
@Configuration
@Import({DomainConfigToImport.class})
public class SpringConfig {

	@Bean
	public InternalProcessor internalProcessor (RestAPIClient restAPIClient, @Qualifier("internalProcObjectMapper") ObjectMapper objectMapper) {
		return new InternalProcessor("internalProcessor", restAPIClient, objectMapper);
	}

	@Bean
	@Qualifier("internalProcObjectMapper")
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
}
