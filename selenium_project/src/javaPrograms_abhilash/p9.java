package javaPrograms_abhilash;

public class p9 {
	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
		int nextNum;
		System.out.print(firstNum + "," + secondNum);
		for (int i = 0; i < 10; i++) {
			nextNum = firstNum + secondNum;
			System.out.print("," + nextNum);
			firstNum = secondNum;
			secondNum = nextNum;
		}
	}
}
