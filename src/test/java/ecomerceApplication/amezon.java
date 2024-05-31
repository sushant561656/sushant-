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

public class amezon {
	@Parameters({ "url"})
	@Test(groups = "smoke")
	public void az(String url) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
//		driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_6j7dxt8smw_e&adgrpid=155259814793&hvpone=&hvptwo=&hvadid=674842289464&hvpos=&hvnetw=g&hvrand=5405169254777430911&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062096&hvtargid=kwd-12692811&hydadcr=5624_2359483&gad_source=1");
		Thread.sleep(2000);
		driver.close();

	}
}


