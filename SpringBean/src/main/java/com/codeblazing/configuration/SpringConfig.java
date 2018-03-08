package com.codeblazing.configuration;

import com.codeblazing.domain.DomainClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
@ComponentScan("com.codeblazing.domainscan")
public class SpringConfig {

	@Bean
	@Description("Spring Domain Class Bean!!")
	public DomainClass domainClass() {
		return new DomainClass();
	}
}
