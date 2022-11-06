package javaPractice;

//programs to find number of digits in number
public class k7 {

	public static void main(String[] args) {

		int count = 0;
		int num = 14523;

		if (num < 0) {
			num = num * -1;
		} else if (num == 0) {
			num = 1;
		}
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("number of digits in given number is=" + count);

	}

}
