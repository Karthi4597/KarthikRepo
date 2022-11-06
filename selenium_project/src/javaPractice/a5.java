package javaPractice;

import java.util.Scanner;

public class a5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String s = sc.next();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println(count);
		if (count > 0)
			System.out.println("word contains vovels");
		else
			System.out.println("word doesnot contains vovels");

		sc.close();
	}

}
