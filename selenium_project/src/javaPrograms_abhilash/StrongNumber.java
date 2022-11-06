package javaPrograms_abhilash;

public class StrongNumber {

	public static void main(String[] args) {
		int a = 145;
		int num = a;

		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			int factorial = 1;
			for (int i = 1; i <= rem; i++) {
				factorial = factorial * i;
			}
			sum = sum + factorial;
			num = num / 10;
		}
		System.out.println("a=" + a);
		System.out.println("sum of factorial=" + sum);
		if (a == sum)
			System.out.println(a + " is strong number");
		else
			System.out.println(a + " is not strong number");
	}
}
