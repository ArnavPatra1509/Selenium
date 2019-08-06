package August5th;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class functions {
	String kw;
	String xp;
	String td;
	boolean tr;
	public WebDriver browser(String url)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get(url);
		return dr;
	}
	public void enter_txt(String xp, String td,WebDriver dr)
	{
		dr.findElement(By.xpath(xp)).sendKeys(td);
	}
	public void click(String xp,WebDriver dr)
	{
		dr.findElement(By.xpath(xp)).click();
	}
	public boolean verify(String xp,String ar,WebDriver dr)
	{
		String s=dr.findElement(By.xpath(xp)).getText();
		if(s.equals(ar))
		{
			return true;
		}
		else {
			return false;
		}
	}
	public String read(int x, int y ,String file_path )
	{
		String result=null;
		try
		{
			File f = new File(file_path);
			FileInputStream  fis = new FileInputStream(f);
			XSSFWorkbook wb =  new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet("Sheet1");
			XSSFRow row = sh.getRow(x);
			XSSFCell cell = row.getCell(y);
			result = cell.getStringCellValue();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("not reading");
		}
		
		return result;
	
	}
	
	public void write(int x, int y, String file_path, String data )
	{

		try
		{
			File f = new File(file_path);
			FileInputStream  fis = new FileInputStream(f);
			XSSFWorkbook wb =  new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet("Sheet1");
			//XSSFRow row1 = sh.createRow(x);
			XSSFRow row1 = sh.getRow(x);
			XSSFCell celld = row1.createCell(y);
			celld.setCellValue(data);
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}
	
}
