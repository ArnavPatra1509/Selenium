package August2nd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import experiments.method;

public class alert_ok_cancel {
	public void disp(){
		method m=new method();
		WebDriver dr=m.webdriver_chrome("http://demo.guru99.com/test/delete_customer.php");
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("adsd");
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		String s=dr.switchTo().alert().getText();
		dr.switchTo().alert().accept();
		String s1=dr.switchTo().alert().getText();
		dr.switchTo().alert().accept();
		System.out.println(s);
		System.out.println(s1);
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("adsd");
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		String s3=dr.switchTo().alert().getText();
		dr.switchTo().alert().dismiss();
		System.out.println(s3);
		dr.close();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
	}

}
