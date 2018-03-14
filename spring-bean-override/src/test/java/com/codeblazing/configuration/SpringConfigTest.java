package com.codeblazing.configuration;

import com.codeblazing.domaintwo.ArekWork;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Arek Czarnoglowski
 * @created: 14.03.2018 23:43
 * @version: 1.0
 */
@Configuration
public class SpringConfigTest {

	@Bean
	public ArekWork arekWork() {
		return new ArekWork();
	}
}
