package asdf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class experiment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");	
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		//3 of them working for login button on facebook
		//dr.findElement(By.cssSelector("label#loginbutton")).click();
		//dr.findElement(By.cssSelector("label.uiButtonConfirm")).click();
		//dr.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
