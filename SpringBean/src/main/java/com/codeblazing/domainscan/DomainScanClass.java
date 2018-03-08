package com.codeblazing.domainscan;

import com.codeblazing.domain.DomainBlueprint;
import org.springframework.stereotype.Component;

/**
 * @author: Arek Czarnoglowski
 * @created: 08.03.2018 23:09
 * @version: 1.0
 */
@Component
public class DomainScanClass extends DomainBlueprint {

	public void springBeanSaysHello() {
		System.out.println("Component scanned Spring bean say's hello !!");
	}
}
