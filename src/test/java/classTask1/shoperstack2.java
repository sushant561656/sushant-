package classTask1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class shoperstack2 extends Basesh1{
@Test(dependsOnMethods = "shoperstack.st()")
public void m3() throws InterruptedException {
	driver.findElement(By.xpath("//a[text()='Men']")).click();
	Thread.sleep(2000);
	
}
}
