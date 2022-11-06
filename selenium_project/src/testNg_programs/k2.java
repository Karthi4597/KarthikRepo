package testNg_programs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class k2 {
	@Parameters("player")
@Test
public void match(String player)
{
	System.out.println(player);
	System.out.println("------------");
	System.out.println(player); 

	
}
}
