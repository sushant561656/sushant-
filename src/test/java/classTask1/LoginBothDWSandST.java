package classTask1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dtaProvider.LoginData;

public class LoginBothDWSandST extends Basecl {

	@Test(dataProvider = "sender", priority = 0)
	public void m1(String email, String pass) throws InterruptedException {
		driver.navigate().to("https://www.shoppersstack.com/");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
	
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		
	}

	@Test(dataProvider = "sender", priority = 1)
	public void m2(String email, String pass) throws InterruptedException {
		driver.navigate().to("https://demowebshop.tricentis.com/");
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Log in']")));
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Thread.sleep(2000);
	}

	@DataProvider(name = "sender")
	public Object[][] send() throws EncryptedDocumentException, IOException {
		return LoginData.loginsh();
	}

}
