package RetryAnalyses;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Retry123 {
	@Test(retryAnalyzer = com.crm.AdavanceSelenium.lisnersRetry1.Sush2.class)
public void rd() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=abhibus&utm_content=Brand&gad_source=1&gclid=Cj0KCQjwgJyyBhCGARIsAK8LVLMofrQZpOeurZTQuRgoS4Gifu2AD7b1o5LyBgZ-k6tohg7Gi5qmrNEaAqieEALw_wcB");
		Thread.sleep(2000);
		
		assertEquals("sush", "kanu");
		driver.close();

	}


}
