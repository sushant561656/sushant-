package dtaProvider;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task1 {
	@Test(dataProvider = "sender")
	public void Login(String email,String pass) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(50));
		driver.navigate().to("https://www.shoppersstack.com/");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		driver.close();
	}
	@DataProvider(name = "sender")
	public Object [][] sender() throws EncryptedDocumentException, IOException{
		
		return LoginData.loginsh();
	}


}
