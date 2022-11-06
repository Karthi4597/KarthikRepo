package JavaPractice;

public class PrimeNumber {
public static void main(String[] args) {
	int num=8;
	boolean flag=true;
	for(int i=2;i<num;i++) 
	{
		if(num%i==0)
		{
			flag=false;
			System.out.println(num+"=is not prime number");
			break;
		}
	}
	if(flag)
	{
		System.out.println(num+"=is prime number");
	}
}
}
