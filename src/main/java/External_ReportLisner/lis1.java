package External_ReportLisner;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import ScreenShoot.baseShot;

public class lis1 extends baseShot  implements   ITestListener {
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
	
//		String name = result.getMethod().getMethodName();
//		report.createTest(name);
		
		  test = report.createTest(result.getMethod().getMethodName());
		
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSuccess(result);
//		String name = result.getMethod().getMethodName();
//		test=report.createTest(name);
//		test.log(Status.PASS,name+" "+"is pass");
		
		test.log(Status.PASS, "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	
//		String name = result.getMethod().getMethodName();
//		test=report.createTest(name);
//		test.log(Status.FAIL,name+" "+"is fail");
		
		 test.fail(result.getThrowable());
		 TakesScreenshot ts=(TakesScreenshot) driver;
		String ss = ts.getScreenshotAs(OutputType.BASE64);
		 test.addScreenCaptureFromBase64String(ss);
	}

	@Override
	public void onTestSkipped(ITestResult result) {

//		String name = result.getMethod().getMethodName();
//		test=report.createTest(name);
//		test.log(Status.SKIP,name+" "+"is skip");
		
		test.skip(result.getThrowable());
	}

	@Override
	public void onStart(ITestContext context) {
	
		report=new ExtentReports();
		File path = new File("./ExtentReport1/dwss4s.html");
		spark = new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("demoWebshop");
		spark.config().setReportName("sushant");
		spark.config().setTheme(Theme.STANDARD);
		report.attachReporter(spark);
		report.setSystemInfo("os", "windos-10");
		report.setSystemInfo("browser", "chrome");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		report.flush();
	}
	
	

}
