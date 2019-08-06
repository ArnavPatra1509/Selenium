package asdf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class experiment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v75.exe");	
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		//String s=dr.findElement(By.xpath("// *[text()='Birthday']")).getText();
		//dr.findElement(By.xpath("// input[@id='email']")).sendKeys("girishindia95@gmail.com");
		//Xpath value changes so not 
		//String s=dr.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/div[1]")).getText();
		String s=dr.findElement(By.xpath("//*[contains(text(),'Create an account')]")).getText();
		System.out.println(s);
		System.out.println("Hello");
	}

}
