package chronologicalOrder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orders {
	
	@BeforeSuite
	public void befoursuit() {
		System.out.println("Befour suit");
	}
	@BeforeTest
	public void befourtest() {
		System.out.println("Befour Test");
	}
	@BeforeClass
	public void befourclass() {
		System.out.println("Befour Class");
	}
	@BeforeMethod
	public void befourmethod() {
		System.out.println("Befour method");
	}
	
	
	@Test
	public void befourtest1() {
		System.out.println("Befour test");
	}

	@AfterSuite
	public void aftersuit() {
		System.out.println("After suit");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After Test");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}
	@AfterMethod
	public void afterthod() {
		System.out.println("After method");
	}
	

}
