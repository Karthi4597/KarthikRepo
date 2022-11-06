package arrays_program;

public class k2 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13 };

		int sum = 13 * 14 / 2;

		int total = 0;

		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}
		System.out.println("sum=" + sum);
		System.out.println("total=" + total);
		System.out.println("missing number=" + (sum - total));
	}
}
