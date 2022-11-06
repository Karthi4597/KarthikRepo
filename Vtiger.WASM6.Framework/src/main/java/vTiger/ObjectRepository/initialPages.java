package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;

public class initialPages {

	public Practice pPage;
	public HomePage hPage;
	public OrganizationPage oPage;
	public CreateOrganization orgPage;

	public initialPages(WebDriver driver) {

		this.pPage = new Practice(driver);
		this.hPage = new HomePage(driver);
		this.oPage = new OrganizationPage(driver);
		this.orgPage = new CreateOrganization(driver);
	}

}
