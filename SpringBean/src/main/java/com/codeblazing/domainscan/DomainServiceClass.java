package com.codeblazing.domainscan;

import com.codeblazing.domain.DomainBlueprint;
import com.codeblazing.domain.DomainClass;
import org.springframework.stereotype.Service;

/**
 * @author: Arek Czarnoglowski
 * @created: 08.03.2018 23:54
 * @version: 1.0
 */
@Service
public class DomainServiceClass extends DomainBlueprint {
	private DomainClass domainClass;

	public DomainServiceClass(DomainClass domainClass) {
		this.domainClass = domainClass;
	}

	public void springBeanSaysHello() {
		System.out.print("Hello Spring Service bean with injected companion  ");
		domainClass.springBeanSaysHello();
	}
}
