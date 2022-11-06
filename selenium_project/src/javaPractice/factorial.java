package javaPractice;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		int no, fact = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");
		no = sc.nextInt();

		for (int i = 1; i <= no; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

		sc.close();
	}

}
