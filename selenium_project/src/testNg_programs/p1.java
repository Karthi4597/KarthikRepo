package testNg_programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class p1 {
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("from before suite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("from after suite");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("from before class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("from after class");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("from before method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("from after method");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("from before test");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("from after test");
	}
	@Test
	public void script()
	{
		System.out.println("from scripts");
	}
	
}
