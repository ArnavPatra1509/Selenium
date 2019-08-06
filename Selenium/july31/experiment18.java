package july31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import experiments.detail_info;
import experiments.method;

public class experiment18 {

	
		// TODO Auto-generated method stub
		public static void read_excel(ArrayList<d> arr)
		{
			method m=new method();
			WebDriver dr=m.webdriver_chrome("http://demowebshop.tricentis.com/login");
		
			for(int x=1;x<=4;x++)
			{
				d di=new d();
				for(int y=0;y<=3;y++)
				{
					try
					{
					File f=new File("C:\\Users\\arnav.patra\\Desktop\\p.xlsx");
					FileInputStream fis=new FileInputStream(f);
					XSSFWorkbook wb=new XSSFWorkbook(fis);
					XSSFSheet sh=wb.getSheet("Sheet1");
					XSSFRow rw=sh.getRow(x);
					XSSFCell cell=rw.getCell(y);
					try 
					{
						if(y==0)
						{
							di.eid=cell.getStringCellValue();
							//System.out.println(s.Sid);
						}
						if(y==1)
						{
							di.pwd=cell.getStringCellValue();
							//System.out.println(s.java);
						}
						if(y==2)
						{
							di.e_o=cell.getStringCellValue();
							di.a_o="";
							dr.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
							dr.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
							dr.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(di.eid);
							dr.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(di.pwd);
							dr.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
							if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span")).isDisplayed())
							{
								di.a_o=di.a_o+dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span")).getText();	
							}
							if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")).isDisplayed())
							{
								di.a_o=di.a_o+dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")).getText();
							}
							if(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")).isDisplayed())
							{
								di.a_o=di.a_o+dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")).getText();
							}
						
			
						

						}
						else
						{
							if((di.a_o.trim()).equals(di.e_o.trim()))
							{
								di.result=true;
							}
							else
							{
								System.out.println(di.a_o + "\n" +di.e_o);
								di.result=false;
							}	
						}
					}
					catch(Exception e)
					{
						
					}
										}
				catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace()
				}
			}
			
			//dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div"));
			
			
			arr.add(di);
		}
		dr.close();

		}
		public static void write_excel(ArrayList<d> arr)
		{
		int x=1;
			for(d s2:arr)
			try {
				File f1=new File("C:\\Users\\arnav.patra\\Desktop\\p.xlsx");
				FileInputStream fis1=new FileInputStream(f1);
				XSSFWorkbook wb=new XSSFWorkbook(fis1);
				XSSFSheet sh=wb.getSheet("Sheet1");
				XSSFRow row1=sh.getRow(x);
				XSSFCell cell=row1.createCell(3);
				cell.setCellValue(s2.a_o);
				FileOutputStream fos=new FileOutputStream(f1);
				wb.write(fos);
				XSSFCell cell1=row1.createCell(4);
				cell1.setCellValue(s2.result);
				FileOutputStream fos1=new FileOutputStream(f1);
				wb.write(fos1);
//				System.out.println(s2.a_o);
//				System.out.println(s2.e_o);
//				
				x++;
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			ArrayList<d> arr=new ArrayList<>();
			read_excel(arr);
			write_excel(arr);
			
	
		
	}

}
