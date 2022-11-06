package javaPractice;

import java.util.Scanner;

public class a4 {
	public static void main(String[] args) {
		int sum = 0;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		while (a > 0) {
			b = a % 10;
			a = a / 10;
			sum = sum + (b * b);
		}
		System.out.println("sum of the number is =" + sum);

		sc.close();
	}
}
