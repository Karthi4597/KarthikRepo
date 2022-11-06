package arrays_program;

public class k1 {
	public static void main(String[] args) {
		String s = "Hi Hello Karthik     Hi Hello Karthik";
		System.out.println(s.length());
		String lowerCase = "";
		String UpperCase = "";
		for (int i = 0; i < s.length(); i++) {
			if (i < s.length() / 2)
				lowerCase = lowerCase + s.toLowerCase().charAt(i);
			else
				UpperCase = UpperCase + s.toUpperCase().charAt(i);
		}
		System.out.println(lowerCase + UpperCase);
	}
}
