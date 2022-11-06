package testNg_programs;

import org.testng.annotations.Test;

public class p19 {
	@Test(groups= {"smoke"})
	public void script1()
	{
		System.out.println("from script1");
	}
	@Test(groups= {"smoke","functional"})
	public void script2()
	{
		System.out.println("from script2");

	}
	@Test(groups= {"functional"})
	public void script3()
	{
		System.out.println("from script3");

	}
	@Test(groups= {"integration"})
	public void script4()
	{
		System.out.println("from script4");

	}
	@Test(groups= {"integration"})
	public void script5()
	{
		System.out.println("from script5");
	
	}
}
