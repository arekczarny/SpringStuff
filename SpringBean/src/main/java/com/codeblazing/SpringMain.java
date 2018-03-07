package com.codeblazing;

import com.codeblazing.configuration.SpringConfig;
import com.codeblazing.domain.DomainClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringMain {
    public static void main( String[] args ) {
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        DomainClass domainClass = (DomainClass) applicationContext.getBean("domainClass");
        domainClass.helloSpring();
        applicationContext.close();
    }
}
