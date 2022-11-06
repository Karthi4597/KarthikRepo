package javaPractice;

public class k3 {
	public static void main(String[] args) {
		String k = "karthik";

		String revK = "";

		char[] ch = k.toCharArray();

		for (int i = k.length() - 1; i >= 0; i--) {
			revK = revK + ch[i];
		}
		System.err.println(revK);
	}
}
