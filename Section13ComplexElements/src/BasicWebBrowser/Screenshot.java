package BasicWebBrowser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		//System.setProperty("webdriver.chrome.driver","D:\\ace-testing\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.geco.driver","D:\\ace-testing\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
			
		System.out.println("Welcome!!!!");
		driver.get("https://www.gmail.com");
		System.out.println("after site open Welcome!!!!");
         driver.manage().window().maximize();
         System.out.println(driver.getTitle());
            
			
			
			
			
			
//			File fullPage = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(fullPage, new File("./Screenshots/fullpage.jpg"));
//			
//			System.out.println("after full screen shot");
			
			
			
			
			
			
			
			
			
			
			
         //driver.close();

	}

}
