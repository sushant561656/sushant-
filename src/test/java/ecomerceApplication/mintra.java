package ecomerceApplication;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mintra {
	@Parameters({ "url"})
	@Test(groups = "smoke")
	public void mt(String url) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
//		driver.navigate().to("https://www.myntra.com/shop/men?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=Cj0KCQjwgJyyBhCGARIsAK8LVLNQ8TSofoWf7I_Iud8Lnvqt4hRx03pTDQq3MjJXiLLKzdGyRtqsDLcaAgu0EALw_wcB");
		Thread.sleep(2000);
		driver.close();

	}

}
