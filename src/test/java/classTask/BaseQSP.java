package classTask;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseQSP {
	WebDriver driver=new ChromeDriver();
	
	@BeforeSuite
	public void DataBase() {
		
	}
	
	@BeforeTest
	public void befourtest() {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://demoapps.qspiders.com/ui/login?scenario=1");
		
	}
	@BeforeClass
	public void befourclass() {
		System.out.println("Befour Class");
	}
	@BeforeMethod
	public void befourmethod() {
		System.out.println("Befour method");
	}
	
	@AfterMethod
	public void afterthod() {
		System.out.println("After method");
	}


	
	@AfterTest
	public void aftertest() {
		driver.quit();
		
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}

	@AfterSuite
	public void aftersuit() {
		System.out.println("After suit");
	}
	

}
