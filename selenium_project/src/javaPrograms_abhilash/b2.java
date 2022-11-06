package javaPrograms_abhilash;

public class b2 {
	public static void main(String[] args) {
		String s="abcba";
		boolean flag = true;
		for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--)
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
