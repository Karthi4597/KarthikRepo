package javaPractice;

public class pattern {

	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int space = 2;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("*");
			}
			System.out.println("");
			col -= 2;
		}

	}

}
