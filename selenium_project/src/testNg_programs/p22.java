
package testNg_programs;

import org.testng.annotations.Test;

public class p22 {
@Test(invocationCount=4)
public void actiscript()
{
	System.out.println("from actiscript");
}
@Test(invocationCount=2)
public void fbscript()
{
	System.out.println("from fbscript");
}
@Test(invocationCount=3,priority=-1)
public void myntrascript()
{
System.out.println("from myntra script");	
}
}
