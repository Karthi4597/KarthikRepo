package javaPrograms_abhilash;

//programs to swap 2 numbers without using temporary variables
public class p3 {
	public static void main(String[] args) {
		int a = 100;
		int b = 300;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}
