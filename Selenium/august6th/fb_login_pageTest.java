package august6th;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class fb_login_pageTest {
  
	Logger log;
	
	@Test
  public void f() {
		log=Logger.getLogger("devpinoyLogger");
		log.info("Test1 executed");
  }
	@Test
	  public void f1() {
			log=Logger.getLogger("devpinoyLogger");
			log.info("Test2 executed");
	  }
}
