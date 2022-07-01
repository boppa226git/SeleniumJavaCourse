package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jobsearch {
	
	
	

 /* public WebDriver Idriver;
	public Jobsearch(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}  */
	
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[2]/h1[1]")
	@CacheLookup
	WebElement txtskill;
	
	
	
	@FindBy(id="id value")
	@CacheLookup
	WebElement txtlocation;
	
	
	@FindBy(id="id value")
	@CacheLookup
	WebElement txtexperience;
	
	
	
	@FindBy(id="id value")
	@CacheLookup
	WebElement txtsearchbutton;
	
	
	public void setskills(String skill)
	{
		txtskill.clear();
		txtskill.sendKeys(skill);
	}
	
	
	public void setlocation(String location)
	{
		txtlocation.clear();
		txtlocation.sendKeys(location);
	}
	
	public void setexperience(String experience)
	{
		txtexperience.clear();
		txtexperience.sendKeys(experience);

	}
	
	
	public void clicksearch()
	{
		txtsearchbutton.click();
	}
	
	
}