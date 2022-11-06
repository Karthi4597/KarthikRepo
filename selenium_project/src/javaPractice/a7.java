package javaPractice;

import java.util.Arrays;

public class a7 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int temp;

		for (int i = 0; i < a.length; i += 2) {
			if (i + 1 < a.length) {
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}
		System.out.println(Arrays.toString(a));

	}
}
