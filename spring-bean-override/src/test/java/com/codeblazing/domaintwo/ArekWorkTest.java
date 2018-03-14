package com.codeblazing.domaintwo;

import com.codeblazing.configuration.SpringSecondConfigTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author: Arek Czarnoglowski
 * @created: 14.03.2018 23:12
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringSecondConfigTest.class)
public class ArekWorkTest {

	private static final String I_AM_AREK = "I am Arek bitches!";

	@Autowired
	WorkTemplate systemUnderTest;

	@Test
	public void should_say_arek_when_asked() {
		//when
		String arekSaid = systemUnderTest.sayYourName();

		//then
		assertThat(arekSaid, is(equalTo(I_AM_AREK)));
	}
}
