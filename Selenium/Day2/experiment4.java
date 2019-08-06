package asdf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class experiment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");	
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		String s=dr.findElement(By.xpath("//input[@name='firstname']//following::input[1]")).getText();
		System.out.println(s);
		
	}

}
