package com.crm.AdavanceSelenium.lisnersRetry1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Sush2 implements IRetryAnalyzer{
	int start=0;int end=3;
	@Override
	public boolean retry(ITestResult result) {
	
	if(start<end) {
		start++;
		return true;
	}
		return false;
	}

}
