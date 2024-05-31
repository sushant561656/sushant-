package Cpm.par123;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Shorperstak {
	@Parameters({"url","email","pass"})
	@Test
	
	public void sht(String url,String email,String pass) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
	
		driver.findElement(By.id("Password")).sendKeys(pass);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Login']")));
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}

}
