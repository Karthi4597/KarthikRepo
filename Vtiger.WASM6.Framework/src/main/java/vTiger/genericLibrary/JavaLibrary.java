package vTiger.genericLibrary;

import java.util.Date;
import java.util.Random;

public class JavaLibrary {
	
	public int getNumber()
	{
	Random ran=new Random();
	int r = ran.nextInt(500);
	return r;
	}
	
	public String getSystemDate()
	{
		Date d=new Date();
		String date = d.toString();
		return date;
	}
	
	public String getSystemDateInFormate()
	{
		Date d1=new Date();
		String[] date1 = d1.toString().split(" ");
		String month = date1[1];
		String dat = date1[2];
		 String time = date1[3];
		 String time1 = time.replace(':','-');
		 String year = date1[5];
		 String systemDateInFormate = month+" "+dat+" "+time1+" "+year;
		
		return systemDateInFormate;//Tue Oct 18 11:00:15 IST 2022

	}
}

