package WebdriverArchitucture;

import org.openqa.selenium.WebDriver;

public class testcase {

	public static void main(String[] args) {
		
		Webdriver driver=null; 
		String type="Firefox";
		 if(type.equalsIgnoreCase("chrome"))
		 {
		 driver=new Chromedriver();
		 }
		 else
			 if(type.equalsIgnoreCase("Firefox"))
			 {
			 driver=new FirefoxDriver();
			 }
			 else
				 if(type.equalsIgnoreCase("ie"))
				 {
				 driver=new InternetExplorer();
				 }
				 
			 
		 driver.gettext();
		 driver.click();
		 driver.sendkeys();
		
	}

}
