package javaPrograms_abhilash;

//program to check factorial of a number
public class p7 {
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num + " is=" + fact);
	}
}
