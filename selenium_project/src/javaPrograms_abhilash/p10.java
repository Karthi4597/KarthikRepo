package javaPrograms_abhilash;

public class p10 {
	static int firstNum = 0;
	static int secondNum = 1;
	static int nextNum;

	public static void main(String[] args) {
		int count = 10;
		System.out.print(firstNum + "," + secondNum);
		fibonoci(count - 2);
	}

	public static void fibonoci(int count) {
		if (count > 0) {
			nextNum = firstNum + secondNum;
			System.out.print("," + nextNum);
			firstNum = secondNum;
			secondNum = nextNum;
			fibonoci(count - 1);

		}
	}
}
