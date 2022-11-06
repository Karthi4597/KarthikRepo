package javaPractice;

//program to find largest number in an array
public class k16 {

	public static void main(String[] args) {
		int[] a = { 2, 6, 7, 1, 9, 8, 5, 3, 4 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("maximum number is =" + max);

	}

}
