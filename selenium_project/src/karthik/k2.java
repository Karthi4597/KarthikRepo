package karthik;

import java.util.Scanner;

public class k2 {
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int a = sc.nextInt();
int temp=a;
int sum=0;
for(int i=1;i<a;i++)
{
	if(temp%i==0)
	{
		sum=sum+i;
	}
}
if(sum==a)
{
	System.out.println("it is a perfect number");
}
else
	System.out.println("number is not perfect number");
sc.close();
}
}
