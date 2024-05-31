package classTask1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basecl {
	WebDriver driver;
	WebDriverWait wait;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//		driver.navigate().to("https://www.shoppersstack.com/");
//		String url = "https://www.shoppersstack.com/";
//		String curl = driver.getCurrentUrl();
		
	}

	@BeforeMethod
	public void Bm() {

		

	}
//	@Test(priority = 0)
//	public void St() {
//		driver.navigate().to("https://www.shoppersstack.com/");
//		driver.navigate().to("https://demowebshop.tricentis.com/");
//		
//	}
//	@Test(priority = 1)
//	public void Dw() {
//		driver.navigate().to("https://demowebshop.tricentis.com/");
//		driver.navigate().to("https://www.shoppersstack.com/");
//	}

	@AfterMethod
	public void Am() {

	}

	@AfterClass
	public void Ac() {
		driver.close();

	}

	@AfterTest
	public void At() {

	}

	@AfterSuite
	public void As() {

	}

}
