package com.codeblazing;

import com.codeblazing.configuration.SpringConfig;
import com.codeblazing.domain.DomainBlueprint;
import com.codeblazing.domain.DomainClass;
import com.codeblazing.domainscan.DomainScanClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringMain {


    public static void main( String[] args ) {
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        DomainClass domainClass = getSpringBean(applicationContext, "domainClass", DomainClass.class);
        domainClass.springBeanSaysHello();
        DomainScanClass domainScanClass = getSpringBean(applicationContext, "domainScanClass", DomainScanClass.class);
        domainScanClass.springBeanSaysHello();
        applicationContext.close();
    }

    private static <T extends DomainBlueprint> T getSpringBean(AbstractApplicationContext applicationContext, String beanName, Class<T> beanClass) {
        return beanClass.cast(applicationContext.getBean(beanName));
    }
}
