package july31;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import experiments.method;

public class experiment17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method m=new method();
		WebDriver dr=m.webdriver_chrome("https://www.facebook.com");
		
		//dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wt=new WebDriverWait(dr,10);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(" //*[@id=\"u_0_a\"]")));
		dr.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();
	}

}
