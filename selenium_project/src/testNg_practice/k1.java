package testNg_practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class k1 {
	
@Parameters("data")	
@Test(invocationCount=3,priority=3)
public void method1(String data)
{
	System.out.println(data+"From method 1");
}

@Parameters("data")	
@Test(invocationCount=2,priority=2)
public void method2(String data)
{
	System.out.println(data+"From method 2");
}
@Parameters("data")	
@Test(invocationCount=4,priority=1)
public void method3(String data)
{
	System.out.println(data+"From the method 3");
}
}
