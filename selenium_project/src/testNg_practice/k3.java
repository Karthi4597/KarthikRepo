package testNg_practice;

import org.testng.annotations.Test;

public class k3 {
@Test(groups= {"first"})
public void method1()
{
	System.out.println("From method 1");
}
@Test(groups= {"second"})
public void method2()
{
	System.out.println("From method 2");
}

@Test(groups= {"third","first"})
public void method3()
{
	System.out.println("From method 3");
}

@Test(groups= {"first"})
public void method4()
{
	System.out.println("From method 4");
}

@Test(groups= {"second","first"})
public void method5()
{
	System.out.println("From method 5");
}

@Test(groups= {"third"})
public void method6()
{
	System.out.println("From method 6");
}

@Test(groups= {"third"})
public void method7()
{
	System.out.println("From method 7");
}
}
