package August2nd;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import experiments.method;


public class methodTest1 {
  @Test
  public void f() {
	  method m=new method();
	  WebDriver dr=m.webdriver_chrome("http://demowebshop.tricentis.com");
	  String ar=m.login(dr,"arnav1509@gmail.com","p@ssword123");
	  String er="arnav1509@gmail.com";
	  Assert.assertEquals(ar, er);
  }
  @Test
  public void f1() {
	  method m=new method();
	  WebDriver dr=m.webdriver_chrome("http://demowebshop.tricentis.com");
	  String ar=m.login(dr,"arnav1509@gmail.com","p@ssword123");
	  String er="arn@gmail.com";
	  Assert.assertEquals(ar, er);
  }
}
