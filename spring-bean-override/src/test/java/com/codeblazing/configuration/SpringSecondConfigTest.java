package com.codeblazing.configuration;

import com.codeblazing.domaintwo.KajoWork;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: Arek Czarnoglowski
 * @created: 14.03.2018 23:53
 * @version: 1.0
 */
@Configuration
@Import({SpringConfigTest.class})
public class SpringSecondConfigTest {

	@Bean
	public KajoWork arekWork() {
		return new KajoWork();
	}
}
