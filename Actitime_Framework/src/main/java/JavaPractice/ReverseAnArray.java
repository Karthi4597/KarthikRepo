package JavaPractice;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] a = { 2, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(a));
		for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
			a[i] = a[i] + a[j];
			a[j] = a[i] - a[j];
			a[i] = a[i] - a[j];
		}
		System.out.println(Arrays.toString(a));

	}

}
