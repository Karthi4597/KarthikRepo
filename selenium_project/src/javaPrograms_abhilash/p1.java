package javaPrograms_abhilash;

import java.util.Scanner;

//program to find greatest of 3 numbers
public class p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the 1st value");
		int a = sc.nextInt();

		System.out.println("enter the 2nd value");
		int b = sc.nextInt();

		System.out.println("enter the 3rd value");
		int c = sc.nextInt();

		if (a > b && a > c)
			System.out.println(a + " is the greatest number");
		if (b > c)
			System.out.println(b + " is the greatest number");
		else
			System.out.println(c + " is the greatest number");
		sc.close();
	}
	
}
