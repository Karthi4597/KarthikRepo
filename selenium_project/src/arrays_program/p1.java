package arrays_program;

import java.util.Arrays;
import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		int[] a = new int[size];
		int[] b = new int[size];
		int c = 0;
		System.out.println("enter " + size + " number to array");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));

		for (int i = size - 1; i >= 0; i--) {
			b[c++] = a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}
