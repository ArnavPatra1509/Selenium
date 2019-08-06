package august6th_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fb_login_page {
	
	By uname=By.xpath("//*[@id=\"email\"]");
	By pwd=By.xpath("//*[@id=\"pass\"]");
	By btn=By.xpath("//*[@id=\"loginbutton\"]");
	By recent=By.xpath("//*[@id=\"u_0_j\"]/div");
	By recent_login_pwd=By.xpath("//*[@id=\"pass\"]");
	By pwd1=By.xpath("//*[@id=\"pass\"]");
	
	WebDriver dr;
	
	public fb_login_page(WebDriver dr)
	{
		this.dr=dr;
	}
	public void set_uname(String un)
	{
		dr.findElement(uname).sendKeys(un);
	}
	public void set_pwd(String powd)
	{
		dr.findElement(pwd).sendKeys(powd);
	}
	public void click1()
	{
		dr.findElement(btn).click();
	}
	public void do_login(String p,String u)
	{
		this.set_uname(p);
		this.set_pwd(u);
		this.click1();
	}
	public String get_title()
	{
		return dr.getTitle();
	}
}
