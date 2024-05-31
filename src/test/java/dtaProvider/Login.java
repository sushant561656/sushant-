package dtaProvider;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Login {
	@Test(dataProvider = "sender")
	public void Login(String email,String pass) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.cssSelector("input[value='Log in'")).click();
		Thread.sleep(2000);
		driver.close();
	}
	@DataProvider(name = "sender")
	public Object [][] sender() throws EncryptedDocumentException, IOException{
		
		return LoginData.logindws();
	}

}
