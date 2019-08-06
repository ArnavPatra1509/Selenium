package july31;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import experiments.method;

public class Experiment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method m=new method();
		WebDriver dr=m.webdriver_chrome("http://demowebshop.tricentis.com");
		WebElement we1=m.webelement1("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a", dr );
		WebElement we2=m.webelement1("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/ul/li[2]/a", dr );
				
		Actions ac= new Actions(dr);
		
		Action set=ac.moveToElement(we1).build();
	
		set.perform();
		
		Action set1=ac.moveToElement(we2).click().build();
		
		set1.perform();
	}

}
