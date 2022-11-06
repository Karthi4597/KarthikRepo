package javaPractice;

import java.util.Arrays;

public class k1 {

	public static void main(String[] args) {
		String s = "Mary";
		String s1 = "Army";
		char[] c = s.toLowerCase().toCharArray();
		char[] c1 = s1.toLowerCase().toCharArray();
		System.out.println(c);
		System.out.println(c1);
		Arrays.sort(c);
		Arrays.sort(c1);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(Arrays.equals(c, c1));
	}

}
