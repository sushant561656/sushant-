package travalingApplications;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class abhiBus {
	@Test
	public void rd() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=abhibus&utm_content=Brand&gad_source=1&gclid=Cj0KCQjwgJyyBhCGARIsAK8LVLMofrQZpOeurZTQuRgoS4Gifu2AD7b1o5LyBgZ-k6tohg7Gi5qmrNEaAqieEALw_wcB");
		Thread.sleep(2000);
		driver.close();

	}


}
