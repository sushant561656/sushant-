package assertion;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.crm.AdavanceSelenium.dws.Base12;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import classTask1.Basesh1;
import classTask1.Basesh2;
import dtaProvider.LoginData;
@Listeners(com.crm.AdavanceSelenium.dws.Dwslogin.class)
public class DwsLoginWithIListener extends Base12 {

	@Test(priority = 0)

	public void m2() throws InterruptedException {

		
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		Thread.sleep(2000);
		 WebElement s = driver.findElement(By.xpath("//input[@value='Add to cart']"));
		s.click();
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys(pass1);
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys(name1);
		Thread.sleep(2000);
		
		driver.findElement(By.id("addtocart_1_EnteredQuantity")).sendKeys(qty1);
		Thread.sleep(2000);
		
	
	
		
	}
//	@Test
//	public void m3() throws InterruptedException {
//		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
//		
//		List<WebElement> s = driver.findElements(By.cssSelector("input[value='Add to cart']"));
//		
//		for (WebElement web: s) {
//			web.click();
//			Thread.sleep(2000);
//			
//		}
//		
//	}

}
