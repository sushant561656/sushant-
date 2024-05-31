package Extent_Reports;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class sampaleReport {
	
	@Test
	public void launchTheReport() {
		ExtentReports report = new ExtentReports();
		File path = new File("./ExtentReport1/sample.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("sushants test cases");
		spark.config().setReportName("sushant");
		spark.config().setTheme(Theme.STANDARD);
		report.attachReporter(spark);
		ExtentTest test1 = report.createTest("test case 1");
		test1.log(Status.PASS,"your tast case passs😍😍😍😍😍😍😍😍😍😍");
		test1.log(Status.FAIL,"login fail😡😡😡🖕ye kya he maja lagake rkha h");
		report.flush();
	}

}
