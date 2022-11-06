package javaPractice;
//program to swap numbers without using temporary variable

public class k10 {
	public static void main(String[] args) {

		int a = 6;
		int b = 14;

		System.out.println("value of a is=" + a);
		System.out.println("value of b is=" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("------------------");
		System.out.println("value of a is=" + a);
		System.out.println("value of b is=" + b);
	}
}
