package javaPrograms_abhilash;

public class b3 {
	public static void main(String[] args) {
		String s="abcbc";
		boolean flag = true;
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				flag=false;
				break;
			}
			i++;
			j--;
		}
		if(flag)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	
	}
}
