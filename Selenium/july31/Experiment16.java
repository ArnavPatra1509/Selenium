package july31;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import experiments.method;

public class Experiment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method m=new method();
		WebDriver dr=m.webdriver_chrome("https://www.facebook.com");
		WebElement we1=dr.findElement(By.xpath("//*[@id=\"u_0_l\"]"));
		WebElement we2=dr.findElement(By.xpath("//*[@id=\"u_0_n\"]"));
		Actions act = new Actions(dr);
		Action many_actions=act.moveToElement(we1).click(we1).sendKeys("Java").keyDown(we1, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(we1,Keys.CONTROL).build();
		many_actions.perform();
		Actions act1=new Actions(dr);
		Action many_actions1=act1.moveToElement(we2).click(we2).keyDown(we2, Keys.CONTROL).sendKeys(we2,"v").keyUp(we2,Keys.CONTROL).build();
		many_actions1.perform();
	}

}
