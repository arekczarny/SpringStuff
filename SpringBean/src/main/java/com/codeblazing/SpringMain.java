package com.codeblazing;

import com.codeblazing.configuration.SpringConfig;
import com.codeblazing.domain.DomainBlueprint;
import com.codeblazing.domain.DomainClass;
import com.codeblazing.domainscan.ControllerServiceClass;
import com.codeblazing.domainscan.DomainScanClass;
import com.codeblazing.domainscan.DomainServiceClass;
import com.codeblazing.repository.SpringRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringMain {


    public static void main( String[] args ) {
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
	    System.out.println("Spring context beans count : " + applicationContext.getBeanDefinitionCount());
	    System.out.println("Spring Bean Names are :");
	    for (String beanName : applicationContext.getBeanDefinitionNames()) {
		    System.out.println("Spring context bean name: " + beanName);
	    }
        DomainClass domainClass = getSpringBean(applicationContext, "domainClass", DomainClass.class);
        domainClass.springBeanSaysHello();
        DomainScanClass domainScanClass = getSpringBean(applicationContext, "domainScanClass", DomainScanClass.class);
        domainScanClass.springBeanSaysHello();
        SpringRepository springRepository = getSpringBean(applicationContext, "springRepository", SpringRepository.class);
        springRepository.springBeanSaysHello();
        DomainServiceClass domainServiceClass = getSpringBean(applicationContext, "domainServiceClass", DomainServiceClass.class);
        domainServiceClass.springBeanSaysHello();
        ControllerServiceClass controllerServiceClass = getSpringBean(applicationContext, "controllerServiceClass", ControllerServiceClass.class);
        controllerServiceClass.springBeanSaysHello();
	    System.out.println(controllerServiceClass.getHello());

        applicationContext.close();
    }

    private static <T extends DomainBlueprint> T getSpringBean(AbstractApplicationContext applicationContext, String beanName, Class<T> beanClass) {
        return beanClass.cast(applicationContext.getBean(beanName));
    }
}
