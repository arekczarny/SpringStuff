package com.codeblazing;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: Arek Czarnoglowski
 * @created: 12.03.2018 00:54
 * @version: 1.0
 */
@SpringBootApplication
public class SpringApp {

	private final AtomicLong beansCounter = new AtomicLong();

	public static void main(String[] args) {
		System.out.println("Hello Spring Boot Rest Controller App !!!");
		SpringApplication.run(SpringApp.class);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Beans in Spring Boot Applicatoin");
			String [] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String beanName : beanNames) {
				System.out.println("Bean no: " + beansCounter.addAndGet(1L) + " name: " + beanName);
			}
		};
	}
}
