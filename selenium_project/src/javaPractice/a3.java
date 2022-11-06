package javaPractice;

import java.util.Scanner;

//program to display the count of teh given numbers
public class a3 {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		while (a > 0) {
			a = a / 10;
			count++;
		}
		System.out.println("number contains " + count + " digits");
		sc.close();
	}
}
