package javaPractice;

import java.util.Scanner;

public class k13 {
	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");

		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}

		System.out.println(fact);
		sc.close();
	}

}
