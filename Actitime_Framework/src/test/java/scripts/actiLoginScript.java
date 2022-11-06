package scripts;

import org.testng.annotations.Test;

import generic.baseTest;
import pages.initialisePages;

public class actiLoginScript extends baseTest {
	@Test
	public void actiLoginScript()
	{
		initialisePages pages=new initialisePages(driver);
		pages.actiLogin.login("admin", "manager");
	}
}
