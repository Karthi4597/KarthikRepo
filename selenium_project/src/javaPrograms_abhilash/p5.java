package javaPrograms_abhilash;

//program to check wheather the number is palindrome or not
public class p5 {
	public static void main(String[] args) {
		int num = 34143;
		int a = num;
		int rem = 0;
		int rev = 0;
		while (a > 0) {
			rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}
		if (num == rev)
			System.out.println("number is palindrome");
		else
			System.out.println("number is not palindrome");
	}

}
