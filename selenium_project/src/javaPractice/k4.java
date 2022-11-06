package javaPractice;

import java.util.TreeSet;

public class k4 {

	public static void main(String[] args) {
		int[] a = { 10, 5, 25, 15, 20 };

		TreeSet<Integer> t = new TreeSet<>();
		for (Integer x : a) {
			t.add(x);
		}

		System.out.println(t);

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		// System.out.println(Arrays.toString(a));
	}

}
