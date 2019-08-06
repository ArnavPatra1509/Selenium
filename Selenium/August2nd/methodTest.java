package August2nd;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import experiments.method;


import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class methodTest {
	
	method m=new method();
	WebDriver dr;


  @Test
  public void f() {
	  String s="arnav1509@gmail.com";
	  String s1="p@ssword123";
	  String s9=m.login(dr, s, s1);
	  SoftAssert a=new SoftAssert();
	  a.assertEquals(s,s9);
	  System.out.println(s9);
     // Assert.assertEquals(s, s9);
      
	    }
  @Test
  public void f1() {
	  String s="ar";
	  String s1="p@ssword123";
	  String s9=m.login(dr, s, s1);
	  //Assert.assertEquals(s, s9);
	  SoftAssert a=new SoftAssert();
	  a.assertEquals(s,s9);
	  System.out.println(s9);
  }
  @Test
  public void f2() {
	  String s="ar@gmail.com";
	  String s1=" ";
	  String s9=m.login(dr, s, s1);
	  //Assert.assertEquals(s, s9);
	  SoftAssert a=new SoftAssert();
	  a.assertEquals(s,s9);
      System.out.println(s9);
	    }
   @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
	  dr=new ChromeDriver();
      dr.get("http://demowebshop.tricentis.com");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  dr.quit();
  }

}
