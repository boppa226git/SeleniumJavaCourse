package stepDefinitions;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pageobjects.Jobsearchwithmoreoptionspage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Jobsearchwithmoreoptions  {
	
	
	 ChromeDriver driver;
	 Jobsearchwithmoreoptionspage searchobj;
	 Actions a;
	 
	 
	 @Before
	    public void setUp() {
		 ChromeOptions options=new ChromeOptions();
		 options.setAcceptInsecureCerts(true);
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	   	    driver=new ChromeDriver(options); 
	   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	       
	    }
	 
	 //private static final Logger log = LogManager.getLogger(Jobsearchwithmoreoptions.class.getName());
	 
	
	 @Given("User is on Home page")
	    public void userOnHomePage() {
	 
	       
		 driver.get("https://www.cv-library.co.uk/");
		 driver.manage().window().maximize();
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 System.out.println(driver.findElements(By.xpath("//*[@id=\"home-search-new\"]/div/div/div[1]/img")).size());
		 long a=driver.findElements(By.xpath("//*[@id=\"home-search-new\"]/div/div/div[1]/img")).size();
		 Assert.assertEquals(1, a);
		
		
		 
	 }
	 
	    @When("User enters username as {string}")
	    public void entersUsername(String userName) throws InterruptedException {
	 
	        System.out.println("Username Entered");
	        
	       
	        
	    }
	 
	    private Actions findElement(By cssSelector) {
			// TODO Auto-generated method stub
			return null;
		}

		@When("User enters password as {string}")
	    public void entersPassword(String passWord) throws InterruptedException {
	 
	    }
	 
	    @Then("User should be able to login sucessfully")
	    public void sucessfullLogin() throws InterruptedException {
	 
	        //String newPageText = driver.findElement(By.id("welcome")).getText();
	        System.out.println("newPageText");
	        //assertThat(newPageText, containsString("Welcome"));
	 
	    }
	 
	    @Given("user launch chrome browser")
	    public void user_launch_chrome_browser() {
	    	System.out.println("second scenario laucnch chrome");
	       
	    }
	    @When("User enters url as {string}")
	    public void user_enters_url_as(String url) throws InterruptedException {
	    	System.out.println("second scenario url"+url);
	    	driver.get(url);
			 driver.manage().window().maximize();
			 Thread.sleep(4000);
	        
	    }
	    
	    
	    
	    
	    @After
	    public void teardown() {
	 
	        driver.quit();
	    }
}	 
	 
	 
	 
	 
	 
