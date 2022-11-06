package javaPrograms_abhilash;

//programs to swap 2 numbers using temporary variables
public class p2 {
	public static void main(String[] args) {
		int a = 300;
		int b = 100;
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}
