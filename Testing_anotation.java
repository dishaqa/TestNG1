package TestNG;

import org.testng.annotations.Test;

public class Testing_anotation 
{
@Test(priority=2)
	public void login()
	{
		System.out.println("login");
	}

@Test(priority=3)

	public void logout()
	{
		System.out.println("logout");
	}
@Test(priority=1)
public void registration()
{
	System.out.println("registration");
}

}
