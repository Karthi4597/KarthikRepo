package aditya;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Solution
{
	public int uniqueDigit(int[] nums) 
	{
		HashSet<Integer> set = new HashSet<>() ; 
		final int len = nums.length ;
		for(int i=0 ; i<len ; i++) {
			set.add(nums[i]) ;
		}
		int[] whitelist = new int[set.size()] ;
		int i=0 ;
		for(Iterator<Integer> it = set.iterator(); it.hasNext();) {
			whitelist[i++] = it.next() ;
		}
		int temp = 0 ;
		temp = whitelist[0] ;
		return temp ;
		
	}
}

class main {
	public static int[] takeInput(String input)
	{
		if(input.length()==0)
		{
			return new int[0];
		}
		String[] parts=input.split(" ");
		int[] output =new int[parts.length];
		for(int index=0;index<parts.length;index++)
		{
			String part=parts[index].trim();
			output[index]=Integer.parseInt(part);
		}
		return output;
	}
	public static void main(String[] args) 
	{
		Scanner myObj=new Scanner(System.in);
		System.out.println("enter line");
		String line=myObj.nextLine();
		int[] numbers=takeInput(line.trim());
		System.out.println(new Solution().uniqueDigit(numbers));
		myObj.close();
	}
}
