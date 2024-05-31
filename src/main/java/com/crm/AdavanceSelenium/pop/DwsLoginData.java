package com.crm.AdavanceSelenium.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DwsLoginData {
	public DwsLoginData(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public@FindBy(id = "Email")

	WebElement username;
	public@FindBy(id = "Password")
	WebElement pass;

	public@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginButton;

	

}
