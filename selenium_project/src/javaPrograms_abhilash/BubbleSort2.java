package javaPrograms_abhilash;

import java.util.Arrays;

public class BubbleSort2 {
	public static void main(String[] args) {
		int[] a= {30,10,20,80,60,40};
		System.out.println(Arrays.toString(a));

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
	}
}
