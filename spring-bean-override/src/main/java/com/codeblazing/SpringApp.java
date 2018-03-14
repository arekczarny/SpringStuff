package com.codeblazing;

import com.codeblazing.configuration.SpringConfig;
import com.codeblazing.domain.InternalProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author: Arek Czarnoglowski
 * @created: 12.03.2018 00:54
 * @version: 1.0
 */
public class SpringApp {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println("Spring context beans count : " + applicationContext.getBeanDefinitionCount());
		System.out.println("Spring Bean Names are :");
		for (String beanName : applicationContext.getBeanDefinitionNames()) {
			System.out.println("Spring context bean name: " + beanName);
		}
		InternalProcessor internalProcessor = (InternalProcessor) applicationContext.getBean("internalProcessor");
		System.out.println("Bean Function is: " + internalProcessor.getBeanFunction());
	}
}
