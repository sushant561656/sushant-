package classTask;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class QspiderFrom extends BaseQSP {
	@Test
	public void Qsp() throws InterruptedException {
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("requiredfield")).sendKeys("sush");
		Thread.sleep(1000);
		driver.findElement(By.name("minLength")).sendKeys("kan"); 
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("sushant5616");
		Thread.sleep(1000);
		driver.findElement(By.name("confirmpass")).sendKeys("sushant5616");
		Thread.sleep(1000);
		driver.findElement(By.name("maxLength")).sendKeys("dada bolaych");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("sushantkanwade5616@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("digits")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(5000);
		
	}
	

}
