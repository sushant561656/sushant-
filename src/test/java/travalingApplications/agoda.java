package travalingApplications;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class agoda {
	@Test(groups = "regration")
	public void rd() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.agoda.com/?site_id=1891461&tag=3cda3586-9ec8-88d2-2819-7b1e8bb3ad04&gad_source=1&device=c&network=g&adid=682276368900&rand=10447122613161831843&expid=&adpos=&aud=kwd-2230651387&gclid=Cj0KCQjwgJyyBhCGARIsAK8LVLNbBMyjuvavL2FhtB91hD77eMZ7Z5j78LG3I4XshH0olC3h4h1AuiIaApWfEALw_wcB&pslc=1&ds=HaEn0vyYH5dQdxL2");
		Thread.sleep(2000);
		driver.close();

	}


}
