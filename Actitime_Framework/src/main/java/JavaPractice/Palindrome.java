package JavaPractice;

public class Palindrome
{
	public static void main(String[] args) 
	{
		String s = "srirs";
		int i = 0;
		int j = s.length() - 1;
		while (i < j) 
		{
			if (s.charAt(i) != s.charAt(j)) 
			{
				System.out.println("Word is not palindrome");
				break;
			}
			i++;
			j--;
		}
		System.out.println("word is palindrome");
	}
}
