package javaPractice;

import java.util.Arrays;

public class a6 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = new int[a.length];
		int c = 0;

		for (int i = a.length - 1; i >= 0; i--) {
			b[c++] = a[i];
		}

		System.out.println(Arrays.toString(b));

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
