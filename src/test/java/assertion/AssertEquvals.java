package assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.AdavanceSelenium.dws.Base12;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;


public class AssertEquvals extends Base12{
	
	@Test
	public void s1() throws InterruptedException {
		SoftAssert ass=new SoftAssert();
		String expectedUrl = "https://demowebshop.tricentis.com/";
		String actualUrl = driver.getCurrentUrl();
//		AssertJUnit.assertEquals(expectedUrl, actualUrl);
		boolean result = actualUrl.equals(expectedUrl);
		ass.assertTrue(result);
		driver.findElement(By.id("small-searchterms")).sendKeys("wagh");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		ass.assertAll();
		
	}
	
	

}
