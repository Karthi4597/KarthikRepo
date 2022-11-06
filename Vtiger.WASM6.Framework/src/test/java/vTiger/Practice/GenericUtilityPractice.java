package vTiger.Practice;

import java.io.IOException;

import vTiger.genericLibrary.JavaLibrary;
import vTiger.genericLibrary.PropertyFileLibrary;

public class GenericUtilityPractice {

	public static void main(String[] args) throws IOException {
	
	JavaLibrary ja=new JavaLibrary();
	String SysDate = ja.getSystemDate();
	System.out.println(SysDate);//Tue Oct 18 11:00:15 IST 2022

	
	 String SysDate1 = ja.getSystemDateInFormate();
	 System.out.println(SysDate1);
	 
	 PropertyFileLibrary pl=new PropertyFileLibrary();
	 String BROWSER = pl.readDataFromPropertyFile("password");
	 System.out.println(BROWSER);
	
	}

}
