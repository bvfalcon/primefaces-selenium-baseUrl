package org.primefaces.test;

import org.openqa.selenium.support.FindBy;
import org.primefaces.selenium.AbstractPrimePage;
import org.primefaces.selenium.component.OutputLabel;

import lombok.Getter;

public class IntegrationTestPage extends AbstractPrimePage {

	@FindBy(id = "frmTest:lblTest")
	@Getter
	private OutputLabel label;

	@Override
	public String getLocation() {
		return "test.xhtml";
	}
}
