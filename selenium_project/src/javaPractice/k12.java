package javaPractice;

import java.util.Scanner;

public class k12 {
	public static void main(String[] args) {

		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");

		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			sum = sum + i;
		}

		System.out.println(sum);
		sc.close();
	}
}
