package testNg.Practice;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import vTiger.genericLibrary.ExcelFileLibrary;

public class DpClass {

	
	@DataProvider
	public Object[][] organizationData() throws Throwable
	{
		ExcelFileLibrary eLib=new ExcelFileLibrary();
		int row = eLib.getRowCount("kar");//4
		short cell = eLib.getCellCount("kar", row);//2
		
		System.out.println(row);
		System.out.println(cell);
		
		
		Object[][] ob=new Object[row][cell];
		ob[0][0]=eLib.readDataFromExcel("kar", 0, 0);
		ob[0][1]=eLib.readDataFromExcel("kar", 0, 1);
		ob[1][0]=eLib.readDataFromExcel("kar", 1, 0);
		ob[1][1]=eLib.readDataFromExcel("kar", 1, 1);
		ob[2][0]=eLib.readDataFromExcel("kar", 2, 0);
		ob[2][1]=eLib.readDataFromExcel("kar", 2, 1);
		
		return ob;
	}
	
	@Test(dataProvider="organizationData")
	public void printData(String Team,String Player)
	{
		System.out.println(Team=Player);
	}
	
	
}
