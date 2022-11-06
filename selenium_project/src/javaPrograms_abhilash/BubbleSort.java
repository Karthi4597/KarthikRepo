package javaPrograms_abhilash;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a= {40,20,15,10,25};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j-1]>a[j])
				{
					a[j-1]=a[j-1]+a[j];
					a[j]=a[j-1]-a[j];
					a[j-1]=a[j-1]-a[j];
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
