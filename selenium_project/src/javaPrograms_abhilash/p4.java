package javaPrograms_abhilash;

//program to reverse a number
public class p4 {
	public static void main(String[] args) {
		int a = 341;
		int rem = 0;
		int rev = 0;
		while (a > 0) {
			rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}
		System.out.println("rev=" + rev);
	}

}
