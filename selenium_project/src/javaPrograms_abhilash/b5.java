package javaPrograms_abhilash;

public class b5 {
public static void main(String[] args) {
	String s="sriram";
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
				System.out.println(s.charAt(j));
		}
	}
}
}
