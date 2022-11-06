package javaPrograms_abhilash;

public class p8 {
	public static void main(String[] args) {

		int total = sum(6);

		System.out.println(total);
		System.out.println(sum(5));
	}

	static int sum(int n) {
		if (n == 1)
			return 1;
		else
			return n * sum(n - 1);
	}
}
