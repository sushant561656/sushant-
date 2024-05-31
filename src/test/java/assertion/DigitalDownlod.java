package assertion;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.crm.AdavanceSelenium.dws.Base12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class DigitalDownlod extends Base12 {
	@Test
	public void m3() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		
		List<WebElement> s = driver.findElements(By.cssSelector("input[value='Add to cart']"));
		
		for (WebElement web: s) {
			web.click();
			Thread.sleep(2000);
			
		}
		
	}

}
