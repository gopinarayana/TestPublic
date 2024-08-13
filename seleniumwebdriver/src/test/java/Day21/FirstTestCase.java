package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

//	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//	System.out.print("Gopi");
		//launch browser
		//ChromeDriver driver=new ChromeDriver();
	void new()
	{
		
	
	WebDriver driver=new ChromeDriver();
		
		//Open URL
		driver.get("https://demo.opencart.com/");
		
		//verify title
		String title=driver.getTitle();
		if (title.equals("Your store"))
		{
			System.out.print("Passed");
		}
		else
		{
		System.out.print("Failed");
		}
		driver.manage().window().maximize();
		
		driver.findElement(By.name("search")).sendKeys("mac");
		
		FileInputStream file=new FileInputStream("C:\\EWorkspace\\seleniumwebdriver\\testdata\\selenium.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow currentrow=sheet.getRow(0);
		XSSFCell cell=currentrow.getCell(0);
			
		driver.findElement(By.name("search")).sendKeys(cell.toString());
		
		
		//Sleep(10000);
		//close the browser
		//driver.close();
	
	}



}
