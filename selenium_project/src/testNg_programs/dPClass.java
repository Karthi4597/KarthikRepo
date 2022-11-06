package testNg_programs;

import org.testng.annotations.DataProvider;
import apavhe_programs.p5;

public class dPClass 
{
	@DataProvider
	public Object[] demo()
	{
		Object[] data= {"java","selenium","api","python"};
		return data;
	}

	@DataProvider(parallel=true)
	public Object[][] logindata()
	{
		Object[][] d=new Object[4][2];
		d[0][0]="admin";
		d[0][1]="manager";
		d[1][0]="trainee";
		d[1][1]="trainee";
		d[2][0]="Abhi";
		d[2][1]="1234";
		d[3][0]="Java";
		d[3][1]="Selenium";
		return d;
	}
	
	@DataProvider
	public Object[][] adduserdata()
	{
		Object[][] d=new Object[1][5];
		d[0][0]=p5.getData("C:\\Users\\suman\\Desktop\\Karthik\\selenium_workspace\\selenium_project\\data\\ecxel.xlsx", "adduser1",1, 0);
		d[0][1]=p5.getData("C:\\Users\\suman\\Desktop\\Karthik\\selenium_workspace\\selenium_project\\data\\ecxel.xlsx", "adduser1", 1, 1);
		d[0][2]=p5.getData("C:\\Users\\suman\\Desktop\\Karthik\\selenium_workspace\\selenium_project\\data\\ecxel.xlsx", "adduser1", 1, 2);
		d[0][3]=p5.getData("C:\\Users\\suman\\Desktop\\Karthik\\selenium_workspace\\selenium_project\\data\\ecxel.xlsx", "adduser1", 1, 3);
		d[0][4]=p5.getData("C:\\Users\\suman\\Desktop\\Karthik\\selenium_workspace\\selenium_project\\data\\ecxel.xlsx", "adduser1", 1, 4);
		return d;
	}

}
