 package testNg_programs;

import org.testng.annotations.Test;

public class p20 {
@Test(priority=1)
public void actiscript()
{
	System.out.println("from actiscript");
}
@Test(priority=0)
public void fbscript()
{
	System.out.println("from fbscript");
}
@Test(priority=-1)
public void myntrascript()
{
System.out.println("from myntra script");	
}
}
