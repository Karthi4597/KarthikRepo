package pattern_programs;

public class k3 {
	public static void main(String[] args) {
		int row = 3;
		int space = 0;
		int charr = 5;
		char c = 'A';
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < charr; k++) {

				System.out.print(c);
				c++;

			}
			System.out.println();
			charr -= 2;
			space++;
		}
	}
}
