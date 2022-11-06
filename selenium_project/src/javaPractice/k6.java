package javaPractice;

//program to check if the number is palindrome or not
public class k6 {

	public static void main(String[] args) {

		int rev = 0;
		int rem = 0;
		int num = 12321;
		int tempNum = num;
		System.out.println(num);

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);
		System.out.println(tempNum);
		if (rev == tempNum)
			System.out.println("number is palindrom");
		else
			System.out.println("number is not palindrom");

	}

}
