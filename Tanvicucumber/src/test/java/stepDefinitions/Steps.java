package stepDefinitions;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	 ChromeDriver driver;
	@Given("^user launch the chrome browser$")
	public void user_launch_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user launch the chrome browser");
		
		System.setProperty("webdriver.chrome.driver","D:\\ace-testing\\chromedriver.exe");
	        driver=new ChromeDriver();
		
/*		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\ace-testing\\chromedriver.exe");
	       ChromeDriver driver=new ChromeDriver();
			
			
			driver.get("https://www.naukri.com/");
			driver.manage().window().maximize();
			System.out.println("title of page is: " + driver.getTitle());
			Assert.assertEquals("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com", driver.getTitle());
			
			//Thread.sleep(5000);
			
			
			System.out.println(driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/h1[1]")).getText());
			String expected=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/h1[1]")).getText();
			Assert.assertEquals("Find your dream job now",expected);
			
			String skill="Selenium";
			String location="Hyderabad";
			String reqyear="2 years";
			
			
			WebElement we=driver.findElement(By.cssSelector("div.gnb-container div.qsbWrapper div.qsb div.keywordSugg:nth-child(2) div:nth-child(1) div.suggestor-wrapper.active div.suggestor-box.flex-row.flex-wrap.bottom > input.suggestor-input"));
			Actions a=new Actions(driver);
			a.moveToElement(we);
			a.click();
			a.sendKeys(skill);
			a.build().perform();
			
			
			
			WebElement we1=driver.findElement(By.cssSelector("div.gnb-container div.qsbWrapper div:nth-child(1) div.qsb > div.locationSugg:nth-child(4)"));
			a.moveToElement(we1);
			a.click();
			a.sendKeys(location);
			a.build().perform();
			
          
			
			WebElement we2=driver.findElement(By.cssSelector("div.gnb-container div.qsbWrapper div:nth-child(1) div.qsb > div.qsbExperience:nth-child(6)"));
			a.moveToElement(we2);
			a.click();
			a.build().perform();
			
			
			List<WebElement>years=driver.findElements(By.cssSelector("li[value*='#']"));
			System.out.println(" size="+years.size());
			
			
			for(int i=0;i<years.size(); i++)
			{
				String act=years.get(i).getText();
				
				System.out.println(act);
				if(reqyear.equalsIgnoreCase(act))
				{
				System.out.println("ok at 2 yars");
				driver.findElements(By.cssSelector("li[value*='#']")).get(i).click();
				driver.findElement(By.cssSelector("div.gnb-container div.qsbWrapper div:nth-child(1) div.qsb > div.qsbSubmit:nth-child(7)")).click();
				
				
				
				TakesScreenshot scrShot =(TakesScreenshot)driver;
				File sf=scrShot.getScreenshotAs(OutputType.FILE);;
				File df=new File("./Screenshots/img2.jpg");
				FileUtils.copyFile(sf,df);
				System.out.println("Suceessfully");
				}
				
			}
			 
			
			
		
			
			
			driver.close();
			driver.quit();  */
	
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//throw new PendingException();
		
	

	@Given("^user open url$")
	public void user_open_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user open url");
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		System.out.println("title of page is: " + driver.getTitle());
		Assert.assertEquals("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com", driver.getTitle());
		
		//throw new PendingException();
		
	}

	@When("^user enter skill$")
	public void user_enter_skill() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enter skill");
		System.out.println(driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/h1[1]")).getText());
		String expected=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/h1[1]")).getText();
		Assert.assertEquals("Find your dream job now",expected);
		
		String skill="Selenium";
		String location="Hyderabad";
		String reqyear="2 years";
		
		
		WebElement we=driver.findElement(By.cssSelector("div.gnb-container div.qsbWrapper div.qsb div.keywordSugg:nth-child(2) div:nth-child(1) div.suggestor-wrapper.active div.suggestor-box.flex-row.flex-wrap.bottom > input.suggestor-input"));
		Actions a=new Actions(driver);
		a.moveToElement(we);
		a.click();
		a.sendKeys(skill);
		a.build().perform();
		
		
		
		WebElement we1=driver.findElement(By.cssSelector("div.gnb-container div.qsbWrapper div:nth-child(1) div.qsb > div.locationSugg:nth-child(4)"));
		a.moveToElement(we1);
		a.click();
		a.sendKeys(location);
		a.build().perform();
		
      
		
		WebElement we2=driver.findElement(By.cssSelector("div.gnb-container div.qsbWrapper div:nth-child(1) div.qsb > div.qsbExperience:nth-child(6)"));
		a.moveToElement(we2);
		a.click();
		a.build().perform();
		
		
		List<WebElement>years=driver.findElements(By.cssSelector("li[value*='#']"));
		System.out.println(" size="+years.size());
		
		
		for(int i=0;i<years.size(); i++)
		{
			String act=years.get(i).getText();
			
			System.out.println(act);
			if(reqyear.equalsIgnoreCase(act))
			{
			System.out.println("ok at 2 yars");
			driver.findElements(By.cssSelector("li[value*='#']")).get(i).click();
			driver.findElement(By.cssSelector("div.gnb-container div.qsbWrapper div:nth-child(1) div.qsb > div.qsbSubmit:nth-child(7)")).click();
			
			
			
			TakesScreenshot scrShot =(TakesScreenshot)driver;
			File sf=scrShot.getScreenshotAs(OutputType.FILE);;
			File df=new File("./Screenshots/img2.jpg");
			FileUtils.copyFile(sf,df);
			System.out.println("Suceessfully");
			
		//throw new PendingException();
		
			}
		}
	}

	@Then("^user can view the job details$")
	public void user_can_view_the_job_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user can view the job ");
	   // throw new PendingException();
		
	}

	
}


/*	public WebDriver driver;
	public Jobsearch js;
	
	
	@Given("^user launch the chrome browser$")
	public void user_launch_the_chrome_browser()  {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver/chromedriver.exe");
	    driver=new ChromeDriver();
		js=new Jobsearch(driver);
	    
	}
	
	
	

	@Given("user open url as {string}")
	public void user_open_url_as(String url)    {
	    driver.get(url);
	}

	//@When("user enter skill as {string} and location as {string} and experience as {string}")
	@When("user enter skill ")
	
	public void user_enter_skill_as_and_location_as_and_experience_as(String skill, String location, String experience)  {
	   // js.setskills(skill);
	   // js.setlocation(location);
	   // js.setexperience(experience);
	  //  js.clicksearch();
		System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
	}

	@Then("user can view the job details")
	public void user_can_view_the_job_details() {
	    System.out.println("hhhhhhhhhhhhhhhhhhhhh");
	}
}
*/