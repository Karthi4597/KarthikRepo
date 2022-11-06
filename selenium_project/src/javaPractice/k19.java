package javaPractice;

import java.util.Scanner;

//program to find perfect number
public class k19 {
	public static void main(String[] args) {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");

		int num = sc.nextInt();

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				total = total + i;
			}
		}
		if (num == total)
			System.out.println(num + "  is perfect number");
		else
			System.out.println(num + " is not perfect number");
	}
}
