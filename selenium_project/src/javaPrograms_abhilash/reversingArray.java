package javaPrograms_abhilash;

import java.util.Arrays;

public class reversingArray {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		int b = a.length-1;

		for (int i = 0; i < b / 2; i++) {
			a[i] = a[i] + a[b  - i];
			a[b  - i] = a[i] - a[b  - i];
			a[i] = a[i] - a[b  - i];
		}
		System.out.println(Arrays.toString(a));
	}

}
