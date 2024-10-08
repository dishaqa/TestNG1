package TestNG2;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Different_browser
{
	WebDriver driver;
@Test
public void method1()
{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 1 for chrome");
		System.out.println("Enter 2 for Firefox");
		System.out.println("Enter 3 for Edge");
		int i = s1.nextInt();
		if (i==1)
		{
			driver =new ChromeDriver();
		}
		if (i==2)
		{
			driver =new FirefoxDriver();
		}
		if (i==3)
		{
			driver =new EdgeDriver();
		}
		s1.close();
}
}
