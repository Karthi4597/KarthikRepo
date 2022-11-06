package vTiger.Practice;

import java.util.Random;

public class randomNumbersPractice {

	public static void main(String[] args) {
		
		
		randomNumbersPractice r=new randomNumbersPractice();
		for(int i=0;i<100;i++)
		{
		r.kar();
		} 

	}
	public void kar()
	{
		Random r=new Random();
		int ran = r.nextInt(100);
		System.out.println(ran);
	}

}
