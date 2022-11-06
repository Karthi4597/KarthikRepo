package JavaPractice;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int[] a= {20,90,60,50,10,70,40,80,30};
	System.out.println(Arrays.toString(a));

	for(int i=0;i<a.length;i++)
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
