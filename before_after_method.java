package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class before_after_method 
{
	

@BeforeSuite
public void bs()
{
	System.out.println("bs");
}
@BeforeTest
public void bt()
{
	System.out.println("bt");
}
@BeforeClass
public void bc()
{
	System.out.println("bc");
}
@BeforeMethod
public void bm()
{
	System.out.println("bm");
}
@Test
public void test()
{
	System.out.println("test");
}

@Test
public void test2()
{
	System.out.println("test2");
}
@AfterMethod
public void Am()
{
	System.out.println("am");
}
@AfterClass
public void Ac()
{
	System.out.println("ac");
}
@AfterSuite
public void as()
{
	System.out.println("as");
}
@AfterTest
public void at()
{
	System.out.println("at");

}
}

