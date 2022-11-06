package javaPrograms_abhilash;
import java.util.Arrays;
public class BinarySearch2 {
	public static void main(String[] args) {
		int[] x= {10,30,20,80,60,40};
		Arrays.sort(x);//{10,20,30,40,60,80}
		search(x, 70);
	}
	public static void search(int[] a,int key)
	{
		int first=0;
		int last=a.length-1;
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(key<a[mid])
			{
				last=mid-1;
			}
			if(key==a[mid])
			{
				System.out.println(key+" is present in "+mid+" index");
				break;
			}
			if(key>a[mid])
			{
				first=mid+1;
			}
			mid=(first+last)/2;
		}
		if(first>last)
		System.out.println(key+" is not present");
	}
}
