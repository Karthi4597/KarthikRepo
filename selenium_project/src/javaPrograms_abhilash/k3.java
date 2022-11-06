package javaPrograms_abhilash;

import java.util.Arrays;

public class k3 {
	public static void main(String[] args) {
		int[] a= {35,20,10,15,5,45,40,35};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[j-1]>a[j])
				{
					a[j]=a[j]+a[j-1];
					a[j-1]=a[j]-a[j-1];
					a[j]=a[j]-a[j-1];
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}
}
