package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.AdavanceSelenium.dws.Base12;
import com.crm.AdavanceSelenium.pop.DwsLoginData;

public class LoinDws{
	
	@Test
	public void test() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		DwsLoginData dws=new DwsLoginData(driver);
		dws.username.sendKeys("admin01@gmail.com");
		Thread.sleep(2000);
		dws.pass.sendKeys("admin01");
		Thread.sleep(2000);
		dws.loginButton.click();
		Thread.sleep(2000);

}
}