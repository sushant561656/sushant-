package classTask1;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dtaProvider.LoginData;

public class shoperstack extends Basesh1 {
	@Test(priority = 0, dataProvider = "sender")
	public void st(String email, String pass) throws InterruptedException, EncryptedDocumentException, IOException {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));

		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys(pass);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Login']")));
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//a[text()='Men']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
////		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='add to cart']")));
//
//		List<WebElement> s = driver.findElements(By.xpath("//button[text()='add to cart']"));
//		for (WebElement web : s) {
//			web.click();
//			Thread.sleep(2000);

//		}
	}

	@Test(dependsOnMethods = "st")
	public void m3() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
//			driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='add to cart']")));

		List<WebElement> s = driver.findElements(By.xpath("//button[text()='add to cart']"));
		for (WebElement web : s) {
			web.click();
			Thread.sleep(2000);

		}
	}

	@DataProvider(name = "sender")
	public Object[][] send() throws EncryptedDocumentException, IOException {
		return LoginData.loginsh1();
	}

}
