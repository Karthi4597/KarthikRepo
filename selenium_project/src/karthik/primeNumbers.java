package karthik;

public class primeNumbers {
	public static void main(String[] args) {
		
		for (int i = 2; i<= 100; i++)
		{
			int isPrime=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime++;
					break;
				}
			}
			if(isPrime==0)
				System.out.println(i);
		}
	}
}
