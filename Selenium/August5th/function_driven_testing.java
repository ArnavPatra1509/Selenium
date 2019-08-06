package August5th;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class function_driven_testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=null;
		for(int i=1;i<=5;i++)
		{
			functions f=new functions();
			for(int j=1;j<5;j++)
			{
				
				if(j==1)
				{
					f.kw=f.read(i,j,"C:\\Users\\arnav.patra\\Desktop\\aug5.xlsx");
					System.out.println(f.kw);
				}
				else if(j==2)
				{
					f.xp=f.read(i,j,"C:\\Users\\arnav.patra\\Desktop\\aug5.xlsx");
					System.out.println(f.xp);
				}
				else if(j==3)
				{
					f.td=f.read(i,j,"C:\\Users\\arnav.patra\\Desktop\\aug5.xlsx");
					System.out.println(f.td);
				}
				else
				{	
					switch(f.kw)
					{
					case "launch browser":
						dr=f.browser(f.td);
						break;
					case "enter text": 
						f.enter_txt(f.xp, f.td, dr);
						break;
					case "click":
						f.click(f.xp, dr);
						break;
					case "verify":
						if(f.verify(f.xp, f.td, dr))
						f.write(i, j, "C:\\Users\\arnav.patra\\Desktop\\aug5.xlsx", "Passed");
						else
							f.write(i, j, "C:\\Users\\arnav.patra\\Desktop\\aug5.xlsx", "Failed");
						break;
					}
				}
			}
		}
	}

}
