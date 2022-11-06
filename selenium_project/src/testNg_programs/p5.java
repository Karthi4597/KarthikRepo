package testNg_programs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class p5 {
	@Parameters("RCB")
	
	@Test
	public void demo(String data)
	{
		System.out.println(data);
	}
	
	
	
}
