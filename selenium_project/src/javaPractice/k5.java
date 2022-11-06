package javaPractice;

public class k5 {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int next;
		System.out.println("fibonacci series are");

		for (int i = 0; i < 10; i++) {
			System.out.println(first);
			next = first + second;
			first = second;
			second = next;
		}

	}
}
