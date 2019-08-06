package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class experiment8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("http://demowebshop.tricentis.com");
		
		String s=dr.getTitle();
		System.out.println(s);
		String s1="Demo Web Shop";
		
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		
		String s2=dr.getTitle();
		System.out.println(s2);
		String s3="Demo Web Shop. Register";
		if(s.equals(s1))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(s2.equals(s3))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		dr.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		dr.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Arnav");
		dr.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Patra");
		dr.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("hello@gmail.com");
		
		dr.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("p@ssword123");
		dr.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("p@ssword123");
		
		dr.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		
	}
}
