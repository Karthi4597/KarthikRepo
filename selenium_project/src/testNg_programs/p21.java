package testNg_programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class p21 {
@Test
public void loginscript()
{
	System.out.println("from login script");
}
@Test(dependsOnMethods= {"loginscript"})
public void userscript()
{
	System.out.println("from user script");
	Assert.fail();
}
@Test(dependsOnMethods= {"loginscript","userscript"})
public void aduserscript()
{
System.out.println("from add user script");	
}
}
