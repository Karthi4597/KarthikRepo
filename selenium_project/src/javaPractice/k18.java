package javaPractice;

import java.util.Arrays;

public class k18 {

	public static void main(String[] args) {
		int[] a = { 2, 5, 1, 3, 6, 4 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					a[j] = a[j] + a[j + 1];
					a[j + 1] = a[j] - a[j + 1];
					a[j] = a[j] - a[j + 1];
				}
			}
		}

		System.out.println(Arrays.toString(a));
	}

}
