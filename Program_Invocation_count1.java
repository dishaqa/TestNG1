package TestNG;

import org.testng.annotations.Test;

public class Program_Invocation_count1
{
	@Test(invocationCount=10,priority=1)
	public void registration()
	{
		System.out.println("registration");
	}
	@Test(enabled=false)
	public void login()
	{
		System.out.println("login");
	}
	@Test(priority=2)
	public void logout()
	{
		System.out.println("logout");
	}
}
