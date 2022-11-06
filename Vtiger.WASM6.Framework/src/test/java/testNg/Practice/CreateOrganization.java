package testNg.Practice;

import org.testng.annotations.Test;

import vTiger.ObjectRepository.HomePage;
import vTiger.ObjectRepository.OrganizationPage;
import vTiger.genericLibrary.BaseTest;
import vTiger.genericLibrary.ExcelFileLibrary;

public class CreateOrganization extends BaseTest{

	@Test
	public void CreateNewOrganization() throws Throwable
	{
	HomePage h=new HomePage(driver);
	h.ClickOnOrgaLink();
	
	OrganizationPage o=new OrganizationPage(driver);
	o.clickOnNewOrg();
	
	ExcelFileLibrary eLib=new ExcelFileLibrary();
	String oOrgName = eLib.readDataFromExcel("practice", 2, 1);
	String emp = eLib.readDataFromExcel("practice", 2, 2);

	 vTiger.ObjectRepository.CreateOrganization c=new vTiger.ObjectRepository.CreateOrganization(driver);
	 c.Organization(oOrgName, emp);
	

	}
}
