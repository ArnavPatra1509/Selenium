package asdf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class experiment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
		WebDriver dr1=new InternetExplorerDriver();
		dr1.get("https://www.facebook.com");
	}

}
