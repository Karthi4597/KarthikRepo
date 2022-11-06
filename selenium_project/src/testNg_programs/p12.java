package testNg_programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class p12 {
@DataProvider
public Object[] demo()
{
	Object[] data= {"java","selenium","api","python"};
	return data;
}
@Test(dataProvider="demo")
public void script(String p1)
{
	System.out.println(p1);
}
}
