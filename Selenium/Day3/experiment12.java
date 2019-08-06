package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class experiment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.w3schools.com/html/html_tables.asp");
		for(int r=2;r<=7;r++)
		{
			for(int c=1;c<=3;c++)
			{
				String xp="//*[@id=\"customers\"]/tbody/tr["+ r +"]/td[" + c +"]";
				String data=dr.findElement(By.xpath(xp)).getText();
				System.out.print(" "+ data);
				
			}
			System.out.println();
		}
		
	}

}
