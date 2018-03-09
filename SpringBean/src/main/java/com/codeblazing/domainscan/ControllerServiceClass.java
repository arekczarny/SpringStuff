package com.codeblazing.domainscan;

import com.codeblazing.domain.DomainBlueprint;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Arek Czarnoglowski
 * @created: 09.03.2018 00:09
 * @version: 1.0
 */
@Controller
public class ControllerServiceClass extends DomainBlueprint {

	public void springBeanSaysHello() {
		System.out.println("From controller Service Scan");
	}

	@RequestMapping("/hello")
	public String getHello() {
		return "Hello World Spring MVC!!";
	}
}
