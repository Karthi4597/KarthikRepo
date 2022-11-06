package javaPrograms_abhilash;

import java.util.Arrays;

public class k2 {
public static void main(String[] args) {
	int[] a= {20,30,10,5,15,50,60};
	int first=0;
	int last=a.length-1;
	int mid=(first+last)/2;
	Arrays.sort(a);//[5, 10, 15, 20, 30, 50, 60]
	System.out.println(Arrays.toString(a));
	int b=20;
	while(first<=last)
	{
		if(b<a[mid])
		{
			last=mid-1;
		}
		else if(b==a[mid]) 
		{
			System.out.println(b+" is present at index "+mid);
			break;
		}
		else if(b>a[mid])
		{
			first=mid+1;
		}
		mid=(first+last)/2;
	}
	if(first>last)
		System.out.println(b+" is not found");
	
}
}
