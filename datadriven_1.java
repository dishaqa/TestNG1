package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class datadriven_1 
{
	@Test()
	public void sheet() throws EncryptedDocumentException, IOException
	{
			FileInputStream f1 = new FileInputStream("D:\\Selenium Workspace\\SeleniumJAVA\\Selenium_Project\\DataFetching\\Disha sheet.xlsx");
			Workbook w1 = WorkbookFactory.create(f1);
			String un = w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
			System.out.println(un);
			
	}


}
