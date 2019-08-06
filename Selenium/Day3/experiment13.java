package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class experiment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("http://examples.codecharge.com/Store/Default.php");
		String s=dr.getTitle();
		String s1="Online Bookstore";
		if(s.contentEquals(s1))
		{
			System.out.println("Ture");
		}
		else
		{
			System.out.println("False");
		}
		
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select/option[3]")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table[2]/tbody/tr[1]/td[2]/b/a")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).clear();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).sendKeys("1");
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();
		dr.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/a[1]")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select/option[3]")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table[2]/tbody/tr[3]/td[2]/b/a")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).clear();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).sendKeys("2");
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();
		dr.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/a[1]")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select/option[3]")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table[2]/tbody/tr[5]/td[2]/b/a")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).clear();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).sendKeys("1");
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();
		//dr.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/a[1]")).click();
		double total=0;
		for(int r=1;r<=4;r++)
		{
			method m=new method();
			for(int c=1;c<=4;c++)
			{
				if(r==1 && c==3)
				{
					String xp="/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr["+r+"]/td["+c+"]";
					String data=dr.findElement(By.xpath(xp)).getText();
					System.out.println(data);
					m.write(r, c, "C:\\Users\\arnav.patra\\Desktop\\write.xlsx", data);	
				}
				if(c!=3)
				{
					String xp="/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr["+r+"]/td["+c+"]";
					String data=dr.findElement(By.xpath(xp)).getText();
					System.out.println(data);
					m.write(r, c, "C:\\Users\\arnav.patra\\Desktop\\write.xlsx", data);	
					
					
				}
				if(c==4 && r!=1)
				{
					String s3="";
					String xp="/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr["+r+"]/td["+c+"]";
					String data=dr.findElement(By.xpath(xp)).getText();
					for(int i=0;i<data.length();i++)
					{
						
						if(data.charAt(i)!='$')
						{
							s3=s3+data.charAt(i);
						}
					}
					double x= Double.parseDouble(s3);
					total=total+x;

				}
							
			}
		
			System.out.println();
			
		}
		String s4="";
		String data=dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/p")).getText();
		for(int i=0;i<data.length();i++)
		{
			
			if((((int)(data.charAt(i)))>47 && ((int)(data.charAt(i)))<58) || ((int)(data.charAt(i)))==46 )
			{
				s4=s4+data.charAt(i);
			}
		}
		double s2=Double.parseDouble(s4);
		System.out.println("total "+total+" s2 "+s2);
		if(total==s2)
		{
			System.out.print("True");
		}
		else
		{
			System.out.println("False");
		}
		
		
		
		
	}

}
