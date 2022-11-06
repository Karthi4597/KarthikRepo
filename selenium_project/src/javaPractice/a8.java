package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class a8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();

		int temp;

		int[] a = new int[size];

		System.out.println("eneter " + size + " numbers");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("original array is=" + Arrays.toString(a));

		for (int i = 0; i < size; i += 2) {
			if (i + 1 < size) {

				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}
		System.out.println("Reversed array is=" + Arrays.toString(a));

	}
}
