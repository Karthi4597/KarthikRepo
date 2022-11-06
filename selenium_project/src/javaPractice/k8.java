package javaPractice;

//program to find number of charector a present in string
public class k8 {

	public static void main(String[] args) {
		String a = "malayalam";

		int c = a.length();

		String b = a.replace("a", "");

		int d = b.length();

		int count = c - d;

		System.out.println("number of a in given string is=" + count);
	}

}
