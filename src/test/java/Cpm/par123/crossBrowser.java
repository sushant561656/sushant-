package Cpm.par123;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class crossBrowser {
	public WebDriver driver;
	@Parameters("browser")
	@Test
	public void crb(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}
		 else if((browser.equalsIgnoreCase("safari"))) {
			 driver=new SafariDriver();
			
		}
		 else if((browser.equalsIgnoreCase("edge"))) {
			 driver=new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("https://www.indianhealthyrecipes.com/chicken-kebab-recipe-chicken-kabab/");
	}

}
