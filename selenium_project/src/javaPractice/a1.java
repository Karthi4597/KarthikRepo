package javaPractice;

import java.util.Scanner;

public class a1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String s = sc.next();
		String rev = "";

		int b = s.length();
		int c = b / 2;
		int count = 0;

		for (int i = b - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("word is palindrome");
		} else
			System.out.println("word is not palindrome");

		for (int j = 0; j < c; j++) {
			if (s.charAt(j) == s.charAt(c + j)) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("word is symetric");
		} else {
			System.out.println("word is not symetric");
		}

		if (!s.equals(rev) && count == 0) {
			System.out.println("neither palindrome nor symetric");
		}

		sc.close();
	}

}
