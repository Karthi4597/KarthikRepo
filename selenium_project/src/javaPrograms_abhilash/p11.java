package javaPrograms_abhilash;

public class p11 {
	public static void main(String[] args) {
		int a = 7;
		int count = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 0)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
	}
}
