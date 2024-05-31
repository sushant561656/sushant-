package com.crm.AdavanceSelenium.dws;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Base12 extends externalFileDta {
	protected WebDriver driver;
	protected WebDriverWait wait;

	protected String url1;
	protected String name1;
	protected String pass1;
	protected String qty1;
	
	

	@BeforeSuite
	public void Bs() throws IOException {
		System.out.println("from BefourSuite");
		Properties p = externalFileDta.prop();
		
		url1 = p.getProperty("url");
		name1 = p.getProperty("name");
		pass1 = p.getProperty("pass");
		qty1 = p.getProperty("qty");
		


	}

	@BeforeTest
	public void Bt() {
		System.out.println("from BefourTest");
	}

	@BeforeClass
	public void Bc() {
		System.out.println("from BefourClass");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.navigate().to(url1);

	}

	@BeforeMethod
	public void Bm() throws InterruptedException {
		System.out.println("from BefourMethod");
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(name1);
		driver.findElement(By.id("Password")).sendKeys(pass1);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();

	}

	@AfterMethod
	public void Am() {
		driver.findElement(By.className("ico-logout")).click();

	}

	@AfterClass
	public void Ac() throws InterruptedException {

//		driver.close();

	}

	@AfterTest
	public void At() {

	}

	@AfterSuite
	public void As() {
		driver.close();
	}

}
