package JavaPractice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { 20, 90, 60, 50, 10, 70, 40, 80, 30 };
		
		int first=0;
		int last=a.length-1;
		int mid=(first+last)/2;
		
		int num=89;
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j - 1] > a[j]) {
					a[j] = a[j] + a[j - 1];
					a[j - 1] = a[j] - a[j - 1];
					a[j] = a[j] - a[j - 1];
				}
			}
		}
		System.out.println(Arrays.toString(a));
		while(first<=last)
		{
		if(num<a[mid])
		{
			last=mid-1;
		}
		else if(num==a[mid])
		{
			System.out.println("number is present at index="+mid);
			break;
		}
		else if(num>a[mid])
		{
			first=mid+1;
		}
		mid=(first+last)/2;
		
		}
		if(first>last)
		{
			System.out.println("number is not present in array");
		}
		

	}
}
