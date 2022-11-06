package javaPrograms_abhilash;

//program to chek wheather a number is amstrong number or not
public class p6 {
	public static void main(String[] args) {
		int num = 153;
		int a = num;
		int rem;
		int sum = 0;
		while (a > 0) {
			rem = a % 10;
			sum = sum + rem * rem * rem;
			a = a / 10;
		}
		if (num == sum)
			System.out.println(num + " is amstrong number");
		else
			System.out.println(num + " is not amstrong number");
	}
}
