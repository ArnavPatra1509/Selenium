package August2nd;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class methodTest2 {
  @BeforeClass
  public void get_Data()
  {//Runs before the class starts
	  System.out.println("Before class");
  }
  @AfterClass
  public void cleanup()
  {//After the class is done runs once
	  System.out.println("After class");
  }
  //test methods are executed on the basis of alphabetical order
  @Test(priority=-3)
  public void f3() 
  {
	  System.out.println("f3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  //Runs before every method
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  //Runs after every method
	  System.out.println("After Method");
  }
  @Test(priority=3)
  public void f1() {
	  System.out.println("f1");
  }
  @Test(priority=1)
  public void f2() {
	  System.out.println("f2");
  }
  

}
