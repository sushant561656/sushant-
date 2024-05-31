package classTask1;


import java.time.Duration;

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


public class Basesh1 {
	protected WebDriver driver;
	protected WebDriverWait wait;

	@BeforeSuite
	public void Bs() {
		System.out.println("from BefourSuite");

	}

	@BeforeTest
	public void Bt() {
		System.out.println("from BefourClass");

	}

	@BeforeClass
	public void Bc() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		wait = new WebDriverWait(driver, Duration.ofSeconds(80));
     	driver.navigate().to("https://www.shoppersstack.com/");

		
	}

	
	

	@BeforeMethod
	public void Bm() throws InterruptedException {
		
		
		System.out.println("Before methods");
		

	}
	

	@AfterMethod
	public void Am() {

	}

	@AfterClass
	public void Ac() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[text()='T']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Logout']")));
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		Thread.sleep(3000);
		driver.close();

	}

	@AfterTest
	public void At() {

	}

	@AfterSuite
	public void As() {

	}

}
