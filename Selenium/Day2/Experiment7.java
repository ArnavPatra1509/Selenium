package asdf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");	
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		List<WebElement> rb=dr.findElements(By.name("sex"));
		rb.get(0).click();
		
	}

}
