package javaPractice;

//program to swap numbers with using temporary variable
public class k11 {

	public static void main(String[] args) {
		int orange = 10;
		int mango = 20;
		int temp = mango;
		mango = orange;
		orange = temp;

		System.out.println(orange);
		System.out.println(mango);

	}

}
