package popup_programs;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

public class k1 {
	public static void main(String[] args) {
		StringSelection s = new StringSelection("gfddyythchgchg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	}
}
