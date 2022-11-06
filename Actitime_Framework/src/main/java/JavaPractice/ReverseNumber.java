package JavaPractice;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1432;
		int a = num;
		int rev = 0;
		int rem = 0;
		while (a > 0) {
			rem = a % 10;
			rev = rev*10+ rem;
			a = a / 10;
		}
		System.out.println(num);
		System.out.println(rev);
	}

}
