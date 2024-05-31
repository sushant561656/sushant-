package waches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Watch1 {

	@Test
	public void sonata() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(
				"https://www.sonatawatches.in/product/sonata-poze-quartz-analog-black-dial-watch-for-men-with-black-metal-strap-sp70028nm01w.html?lang=en_IN&plp=true&catID=mens-watches");
		driver.close();

	}

	@Test
	public void police() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(
				"https://policelifestyle.com/ww-en/freedom-of-time-myavatar-smartwatch-by-police-peiun00001-p?variant=PEIUN0000102");
		driver.close();
	}

	@Test
	public void rado() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ethoswatches.com/product-rado-captain-cook-r32129152.html");
		driver.close();
	}

}
