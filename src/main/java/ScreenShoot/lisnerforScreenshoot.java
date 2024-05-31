package ScreenShoot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class lisnerforScreenshoot extends baseShot implements ITestListener{

	
	@Override
	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
//		LocalDateTime date=LocalDateTime.now();
//		LocalDate date=LocalDate.now();
		LocalTime time = LocalTime.now();
		String time1= toString().replace(":", "=");
		File file = ts.getScreenshotAs(OutputType.FILE);
		File to=new File("/Users/shubham/eclipse-workspace/com.crm.AdavanceSelenium/target/sample1"+time1+"dws"+time+".jpg");
		try {
			FileHandler.copy(file, to);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	


}
