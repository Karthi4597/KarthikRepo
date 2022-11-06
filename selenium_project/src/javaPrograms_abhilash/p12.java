package javaPrograms_abhilash;

import java.util.Scanner;

public class p12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		isPrime(a);
	}

	public static void isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % 2 == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
	}
}
