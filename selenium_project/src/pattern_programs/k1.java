package pattern_programs;

public class k1 {
	public static void main(String[] args) {
		int row = 3;
		int space = 2;
		int charr = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < charr; k++) {
				System.out.print("*");
			}
			System.out.println();
			charr += 2;
			space--;
		}
	}
}