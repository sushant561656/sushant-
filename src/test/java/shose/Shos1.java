package shose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Shos1 {
	@Test
	public void puma() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(
				"https://in.puma.com/in/en/pd/softride-symmetry-unisex-running-shoes/379582?swatch=01&referrer-category=mens-shoes");
		driver.close();

	}

	@Test
	public void nike() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.nike.com/in/t/air-max-1-shoes-9JTw1z/HF7746-100");
		driver.close();

	}
	@Test
	public void adidas() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.adidas.co.in/adizero-boston-12-shoes/IG3320.html");
		driver.close();
	}

}
