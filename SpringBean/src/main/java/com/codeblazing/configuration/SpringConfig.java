package com.codeblazing.configuration;

import com.codeblazing.domain.DomainClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"com.codeblazing.domainscan", "com.codeblazing.repository", "com.codeblazing.perf"})
@EnableAspectJAutoProxy
public class SpringConfig {

	@Bean
	@Description("Spring Domain Class Bean!!")
	public DomainClass domainClass() {
		return new DomainClass();
	}
}
