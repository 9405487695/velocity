package TestNGPack;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeClass");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeClass");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@Test (priority = 0)
	public void test1() {
		System.out.println("Test========1");
	}
	
	@Test (priority = 2)
	public void test2() {
		System.out.println("Test=======2");
	}
		
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("BeforeClass");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("BeforeClass");
	}
	

}
