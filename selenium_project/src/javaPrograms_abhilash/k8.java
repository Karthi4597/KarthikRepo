package javaPrograms_abhilash;

public class k8 {
public static void main(String[] args) 
{
	String str="java";
	System.out.println(revString(str));
	
}
public static String revString(String str)
{
	if(str.isEmpty())
		return str;
	else
		return (revString(str.substring(1))+str.charAt(0));
}
}
