package TestNG2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;



public class Cross_browser_parallel 

{
	String nameofbrowser = "chrome";
	WebDriver driver;
	@Test
	@Parameters("browser")
	public	void testcase1(String namebrowser) 
	{
		if (namebrowser.equals("chrome"))
		{
			driver =new ChromeDriver();
		}
		if (namebrowser.equals("edge"))
		{
			driver =new EdgeDriver();
		}
		if (namebrowser.equals("firefox"))
		{
			driver =new FirefoxDriver();
		}
		
	
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();

	}
}
