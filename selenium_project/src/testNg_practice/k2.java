package testNg_practice;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class k2 {
	
@Parameters("data")	
@Test()
public void method1(String data)
{
	System.out.println(data+"From method 1");
}

@Parameters("data")	
@Test(dependsOnMethods= {"method1"})
public void method2(String data)
{
	System.out.println(data+"From method 2");
	Assert.fail();
	
}
@Parameters("data")	
@Test(dependsOnMethods= {"method1","method2"})
public void method3(String data)
{
	System.out.println(data+"From method 3");
}
}
