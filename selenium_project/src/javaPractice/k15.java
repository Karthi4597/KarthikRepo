package javaPractice;

import java.util.Scanner;

public class k15 {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");
		int a = sc.nextInt();
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count > 1) {
			System.out.println("number is not prime");
		} else
			System.out.println("number is prime");
		sc.close();
	}

}
