package screenshort;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;

public class BasicTest  {

public static void main(String[] args) {
		
		
		
    WebDriverManager().chromeDriver().setup();
   //System.setProperty("webdriver.chrome.driver","D:\\ace-testing\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		
	System.out.println("nm,n,mn,mn,");
	driver.get("https://www.aceenggacademy.com");
	
	driver.manage().window().maximize();
	driver.getTitle();
	driver.getCurrentUrl();
	driver.close();
	System.out.println("end");
	  
	}

}
