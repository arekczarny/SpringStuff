package com.codeblazing.repository;

import com.codeblazing.domain.DomainBlueprint;
import org.springframework.stereotype.Repository;

/**
 * @author: Arek Czarnoglowski
 * @created: 08.03.2018 23:46
 * @version: 1.0
 */
@Repository
public class SpringRepository extends DomainBlueprint {

	public void springBeanSaysHello() {
		System.out.println("Hello from Spring bean annotated with Repository!!");
	}
}
