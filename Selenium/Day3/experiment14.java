package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class experiment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[1]/td[2]/input")).sendKeys("Arnavpatra96");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[2]/td[2]/input")).sendKeys("Arnav1509");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[3]/td[2]/input")).sendKeys("Arnav");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[4]/td[2]/input")).sendKeys("Patra");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[5]/td[2]/input")).sendKeys("Arnavpatra96@gmail.com");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[6]/td[2]/input")).sendKeys("B18 ");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[7]/td[2]/input")).sendKeys("Sector 31");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[9]/td[2]/input")).sendKeys("Noida");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[10]/td[2]/select")).sendKeys("Uttar Pradesh");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[11]/td[2]/input")).sendKeys("201310");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[12]/td[2]/select")).sendKeys("India");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[13]/td[2]/input")).sendKeys("9903347954");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[14]/td[2]/input")).sendKeys("9051887019");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[15]/td[2]/select/option[3]")).click();
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[16]/td[2]/select")).sendKeys("21");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[17]/td[2]/select")).sendKeys("Male");
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[18]/td[2]/select/option[2]")).click();
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[19]/td[2]/select/option[3]")).click();
		dr.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[20]/td[2]/textarea")).sendKeys("I like to code. I am training in core java , manual testing , selenium");
	}

}
