package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class experiment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("http://demowebshop.tricentis.com/login");
		
		boolean cs=dr.findElement(By.name("RememberMe")).isSelected();
		boolean fs=true;
		if(cs!=fs)
		{
			dr.findElement(By.name("RememberMe")).click();
		}
	}

}
