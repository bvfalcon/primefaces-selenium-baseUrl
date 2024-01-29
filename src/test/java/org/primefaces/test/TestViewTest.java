package org.primefaces.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;
import org.primefaces.selenium.AbstractPrimePageTest;

public class TestViewTest extends AbstractPrimePageTest {

	@Test
	void testBasic(IntegrationTestPage page) {
		Assertions.assertTrue(page.isAt());
		Assertions.assertEquals("Welcome to PrimeFaces!!!", page.getLabel().getText());
		try {
			Assertions.assertEquals("Must be an error", page.getLabel().getText());
			Assertions.fail();
		} catch (AssertionFailedError e) {
			// very good: MUST be an error
		}
	}
}
