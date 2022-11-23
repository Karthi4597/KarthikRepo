package karthik;

public class k5 {

	public Object printWord(String s)
	{
		String[] s1 = s.split(" ");

		int length = s1.length;
		for (int i = 0; i < length; i++)
		{
			if (s1[i].contains("a") && s1[i].contains("t") || s1[i].contains("T"))
			{	
				System.out.println(s1[i]);
			}
			
		}
		return null;
	

	}

	public static void main(String[] args) {
		k5 k=new k5();
		k.printWord("hat cat boss am a katta kut");
		

	}
}
