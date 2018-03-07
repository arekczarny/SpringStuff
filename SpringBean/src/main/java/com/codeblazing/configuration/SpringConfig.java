package com.codeblazing.configuration;

import com.codeblazing.domain.DomainClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class SpringConfig {

	@Bean
	@Description("Spring Domain Class Bean!!")
	public DomainClass domainClass() {
		return new DomainClass();
	}
}
