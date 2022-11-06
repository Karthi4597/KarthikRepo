package javaPrograms_abhilash;

public class sumOfArray {

	public static void main(String[] args) {
		int[] a = { 1, 4, 6, 7 };
		int sum = 0;
		int product = 1;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		for (int i = 0; i < a.length; i++) {
			product = product * a[i];
		}

		System.out.println("sum of the array =" + sum);

		System.out.println("product of the array =" + product);

	}

}
