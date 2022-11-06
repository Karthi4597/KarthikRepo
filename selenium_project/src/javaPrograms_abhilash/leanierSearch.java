package javaPrograms_abhilash;

public class leanierSearch {
	public static void main(String[] args) {
		int[] x = { 20, 25, 10, 30, 40 };

		System.out.println(search(x, 30));

	}

	public static int search(int[] a, int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}
}
