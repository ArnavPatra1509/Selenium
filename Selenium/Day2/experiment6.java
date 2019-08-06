package asdf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class experiment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver","geckodriver.exe");
		WebDriver dr1=new FirefoxDriver();
		dr1.get("https://www.facebook.com");
	}

}
