package javaPrograms_abhilash;

import java.util.Arrays;

public class Binarysearch {
	public static void main(String[] args) {
		int[] x = { 10, 80, 60, 55, 40 };
		Arrays.sort(x);
		search(x, 80);
	}

	public static void search(int[] a, int key) {
		int first = 0;
		int last = a.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (key < a[mid]) {
				last = mid - 1;
			} else if (key == a[mid]) {
				System.out.println(key + " is found at index " + mid);
				break;
			} else if (key > a[mid]) {
				first = mid + 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last)
			System.out.println(key + "is not found");
	}
}
