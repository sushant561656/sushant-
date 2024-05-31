package ScreenShoot;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseShot {
	public static WebDriver driver;
	public static WebDriverWait wait;
	@BeforeClass
	public void bc() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	@BeforeMethod
	public void bm() {
		System.out.println("befour method ");
		
	}
	
	@AfterClass
	public void ac() {
		driver.close();
	}

}
