package javaPrograms_abhilash;

public class k6 {
public static void main(String[] args) {
	int[] a= {10,20,30,10,30,20,10,10};
	int[] duplicate=new int[a.length];//{0,0,0,0,0,0,0,0}//}0,0,0,1
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)//{0,0,0,1,1,1,1,1,1}
		{
			if(a[i]==a[j])
					{
				duplicate[j]=1;
					}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		if(duplicate[i]==1)
		{
			System.out.println(a[i]);
		}
	}
}
}
