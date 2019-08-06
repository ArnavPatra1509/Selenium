package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class experiment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("http://examples.codecharge.com/Store/Default.php");
		String s=dr.getTitle();
		String s1="Online Bookstore";
		if(s.contentEquals(s1))
		{
			System.out.println("Ture");
		}
		else
		{
			System.out.println("False");
		}
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select/option[3]")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input")).click();
		dr.close();
		
	}

}
