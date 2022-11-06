package javaPractice;

//programs to find factors of numbers
import java.util.Scanner;

public class k14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enters the numbers");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
