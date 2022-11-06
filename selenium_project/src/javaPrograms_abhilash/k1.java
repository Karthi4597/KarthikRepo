package javaPrograms_abhilash;

import java.util.Arrays;

//program to copy arrays into another array
public class k1 {
	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40 };
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			System.out.println(b[i]);
		}
		System.out.println(Arrays.toString(b));
	}
}
