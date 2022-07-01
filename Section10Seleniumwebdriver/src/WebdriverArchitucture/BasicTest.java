package WebdriverArchitucture;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class BasicTest  {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=null;
		String str="firefox";
		// firefoxDriversetup
		if(str.equals("firefox"))
		{
    WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
		}
		else
		{
	
	// chromeDriversetup
    WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
		}
	
	//driver.get("http://gmail.com");
	
	//driver.manage().window().maximize();
	String baseUrl = "http://www.google.com/";
    driver.get(baseUrl);
    //String MainWindow = driver.getWindowHandle();
    //System.out.println("Main window handle is " + MainWindow);
    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("https://way2automation.com");
    Thread.sleep(2000);
    
    //String mainWindowHandle = driver.getWindowHandle();
    Set<String> allWindowHandles = driver.getWindowHandles();
    Iterator<String> iterator = allWindowHandles.iterator();
    //while (iterator.hasNext()) {
    String ParentWindow = iterator.next();
        String ChildWindow = iterator.next();
        
        
        
       
        
            driver.switchTo().window(ChildWindow);
            //driver.close();
            System.out.println("Child window closed");
         
            //driver.switchTo().window(ChildWindow);
            //System.out.println("child window title is: ");
            
            System.out.println(driver.getTitle());
            Thread.sleep(2000);
            driver.quit();
            //WebElement text = driver.findElement(By.id("sampleHeading"));
            // + text.getText());
         //   }

    //ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    //driver.switchTo().window(tabs.get(1)); //switches to new tab
    //driver.get("https://www.facebook.com");
	//driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
	
	  /*//Edge Driversetup
    WebDriverManager.edgedriver();
    EdgeDriver driver3=new EdgeDriver();
	driver3.get("https://way2automation.com");
	
	
	// InternetExplorerDriversetup
    WebDriverManager.iedriver();
    InternetExplorerDriver driver4=new InternetExplorerDriver();
	driver4.get("https://way2automation.com");   */
	}

}

