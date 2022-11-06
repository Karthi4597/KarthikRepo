package javaPrograms_abhilash;

public class sumOfNumbers {
	public static void main(String[] args) {
		int a = 245;
		int num = a;

		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
