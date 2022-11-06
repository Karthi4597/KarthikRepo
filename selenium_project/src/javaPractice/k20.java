package javaPractice;

import java.util.Scanner;

//program to check strong number
public class k20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");

		int a = sc.nextInt();
		int temp = a;
		int total = 0;
		while (temp > 0) {
			int fact = 1;
			int b = temp % 10;
			for (int j = b; j > 0; j--) {
				fact = fact * j;
			}
			total = total + fact;
			temp = temp / 10;
		}
		if (total == a)
			System.out.println(a + " is strong number");
		else
			System.out.println(a + "number is not strong number");
		sc.close();

	}

}
