package Interview_practice;

public class k1 {
	public static void main(String[] args) {
		int[] a= {2,3,8,6,1,4};
		int maxProduct = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]*a[j]>maxProduct)
				{
					maxProduct=a[i]*a[j];	
				}
			}
		}
		System.out.println("Maximun sum of 2 products is "+maxProduct);
	}
}
