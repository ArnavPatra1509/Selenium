package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class experiment11 {


		/**
		 * @param args
		 * 
		 */
		public static void read_excel(ArrayList<detail_info> arr)
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
			WebDriver dr=new ChromeDriver();
			
			dr.get("http://demowebshop.tricentis.com");
			
			for(int x=1;x<=3;x++)
			{
				detail_info di=new detail_info();
				for(int y=0;y<=2;y++)
				{
				try
					{
						File f=new File("C:\\Users\\arnav.patra\\Desktop\\details.xlsx");
						FileInputStream fis=new FileInputStream(f);
						XSSFWorkbook wb=new XSSFWorkbook(fis);
						XSSFSheet sh=wb.getSheet("Sheet1");
						XSSFRow rw=sh.getRow(x);
						XSSFCell cell=rw.getCell(y);
						if(y==0)
						{
							di.email=cell.getStringCellValue();
							//System.out.println(s.Sid);
						}
						if(y==1)
						{
							di.password=cell.getStringCellValue();
							//System.out.println(s.java);
						}
						
											}
					catch (Exception e) {
						// TODO Auto-generated catch block
						//e.printStackTrace()
					}
				}
				dr.findElement(By.xpath("// *[@class=\"ico-login\"]")).click();
				
				dr.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(di.email);
				dr.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(di.password);
				dr.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
				di.actual_output=dr.findElement(By.xpath("// *[@class=\"account\"]")).getText();
				dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();

				arr.add(di);
			}
			dr.close();

			}
			public static void write_excel(ArrayList<detail_info> arr)
			{
			int x=1;
				for(detail_info s2:arr)
				try {
					File f1=new File("C:\\Users\\arnav.patra\\Desktop\\details.xlsx");
					FileInputStream fis1=new FileInputStream(f1);
					XSSFWorkbook wb=new XSSFWorkbook(fis1);
					XSSFSheet sh=wb.getSheet("Sheet1");
					XSSFRow row1=sh.getRow(x);
					XSSFCell cell=row1.createCell(3);
					cell.setCellValue(s2.actual_output);
					FileOutputStream fos=new FileOutputStream(f1);
					wb.write(fos);
					x++;
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<detail_info> arr=new ArrayList<>();
		read_excel(arr);
		write_excel(arr);
		

	}

}
