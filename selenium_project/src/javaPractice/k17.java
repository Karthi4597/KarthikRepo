package javaPractice;

import java.util.Arrays;

public class k17 {
	public static void main(String[] args) {
		int[] a = { 5, 6, 1, 9, 2, 3, 4 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 1 + i; j < a.length; j++) {
				if (a[i] > a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("largest number is=" + a[a.length - 1]);
	}
}
