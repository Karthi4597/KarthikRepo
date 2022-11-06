package javaPrograms_abhilash;

import java.util.Arrays;

public class SlelectionSort 
{
	public static void main(String[] args) 
	{
		int[] a={40,20,15,10};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length-1;i++)
		{
			int minIndex=i;//i=2
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[minIndex]) 
				{
					minIndex=j;
				if(minIndex!=i)
				{
			a[i]=a[i]+a[minIndex];
			a[minIndex]=a[i]-a[minIndex];
			a[i]=a[i]-a[minIndex];
				}
				}
		}
		}
		System.out.println(Arrays.toString(a));

	}
		
}
