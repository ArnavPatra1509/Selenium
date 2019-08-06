package experiments;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class method {
	
		public String  login(WebDriver dr,String s,String s1)
		{
			dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
			dr.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(s);
			dr.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(s1);
			dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
			String s3=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
			if(s3.equals(s))
			{
				s3="Login Successful";
			}
			try {
			if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span")).isDisplayed())
			{
				s3=s3+dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span")).getText();	
			}
			}
			catch(Exception e)
			{
				
			}
			try {
			if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")).isDisplayed())
			{
				s3=s3+dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")).getText();
			}
			}
			catch(Exception e)
			{
				
			}
			try {
			if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")).isDisplayed())
			{
				s3=s3+dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")).getText();
			}
			}
			catch(Exception e)
			{
				
			}

			return s3;
			
		}
		public WebDriver webdriver_chrome(String s) {
			System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
			WebDriver dr=new ChromeDriver();
			
			dr.get(s);
			return dr;
		}
		public WebElement webelement1(String s,WebDriver dr)
		{
			WebElement we1=dr.findElement(By.xpath(s));
			return we1;
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

