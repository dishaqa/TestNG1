package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testng1
{
	@Test(dataProvider="data1")
	public void login_amazon(int input)
	{
		
	}
	
	@DataProvider(name="data1")
	public Object[][] datainput()
	{
		return new Object[][] {{22},{23},{45}};
	}
}
