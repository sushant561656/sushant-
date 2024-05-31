package screenshoot;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ScreenShoot.baseShot;

public class dwsScreenshoot  extends baseShot{
	
	@Test
	public void screenshoot() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}
	@Test
	public void screenshoot2() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}
	@Test
	public void screenshoot3() throws InterruptedException {
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
	}
	
	


}
