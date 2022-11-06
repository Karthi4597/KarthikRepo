package arrays_program;

import java.util.Arrays;
import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		int[] a = new int[size];
		int c = 0;
		System.out.println("enter the numbers to array");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		if (size % 2 == 0) {
			int[] b = new int[size / 2];
			for (int i = 0; i < size; i += 2) {
				b[c++] = a[i] + a[i + 1];
			}
			System.out.println(Arrays.toString(b));

		}
		if (size % 2 != 0) {
			int[] b = new int[size / 2 + 1];
			for (int i = 0; i < size; i += 2) {
				if (i <= size / 2) {
					b[c++] = a[i] + a[i + 1];
				} else {
					b[c++] = a[i];
				}
			}
			System.out.println(Arrays.toString(b));
		}
		sc.close();
	}
}
