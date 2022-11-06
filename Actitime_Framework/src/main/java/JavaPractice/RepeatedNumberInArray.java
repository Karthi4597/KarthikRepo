package JavaPractice;

import java.util.Arrays;

public class RepeatedNumberInArray {

	public static void main(String[] args) {
		int[] a= {10,20,30,10,25,30,20,5,10,20,10};
		int[] b=new int[a.length];
		System.out.println(Arrays.toString(b));
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					b[j]=1;
				}
			}
		}
		System.out.println(Arrays.toString(b));

		for(int i=0;i<a.length-1;i++)
		{
			if(b[i]==1)
			{
			System.out.println(a[i]);	
			}
		}

	}

}
