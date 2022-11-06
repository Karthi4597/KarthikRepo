package aditya;

import java.util.Arrays;

public class k3 {

	public static void main(String[] args) {
		int[] a= {0,1,0,0,1,0,0,0,1,0};
		int[] b=new int[a.length];
		int k=0;
		int j=a.length-1;
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
			b[k]=a[i];	
			k++;
			}
			else if(a[i]==1)
			{
				b[j]=a[i];
				j--;
			}
		}
		
		System.out.println(Arrays.toString(b));
	}
}
