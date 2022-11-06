package karthik;

public class k1 {
public static void main(String[] args) {
	int firstNum=0;
	int secondNum=1;
	int nextNum;
	System.out.println(firstNum);
	System.out.println(secondNum);
	for(int i=1;i<=10;i++)
	{
		
		nextNum=firstNum+secondNum;
		System.out.println(nextNum);
		firstNum=secondNum;
		secondNum=nextNum;
	}
}
}
