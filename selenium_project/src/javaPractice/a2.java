package javaPractice;

import java.util.Scanner;

//program to check the number is palindrome or not
public class a2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();

		int temp = a;
		int rev = 0;
		int rem = 0;
		while (a > 0) {
			rem = a % 10;
			a = a / 10;
			rev = rev * 10 + rem;
		}
		if (rev == temp)
			System.out.println("the number " + temp + " is palindrome");
		else
			System.out.println("the number " + temp + " is not palindrome");
		sc.close();
	}

}
