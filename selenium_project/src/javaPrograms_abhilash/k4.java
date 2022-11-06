package javaPrograms_abhilash;


public class k4 {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter the string value");
		//String s=sc.next();
		String s="hi hello good eve all";
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)!=' ' && s.charAt(i+1)==' ')
			{
				count++;
			}
		}
		System.out.println("total number of words is "+count);
	}
}
