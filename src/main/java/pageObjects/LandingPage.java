package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.Base;

public class LandingPage {
	public WebDriver driver;
	
	
	/*public LandingPage(WebDriver driver) throws IOException
	{
		Base accessDriver= new Base();
		WebDriver driver =accessDriver.base();
		//By signInbutton =By.cssSelector("a[href*='sign_in'] span");
		
		
	}*/
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	By signInbutton =By.cssSelector("a[href*='sign_in'] span");
	By text = By.xpath("//a[contains(text(),'QA Expert Course :Software Testing + Bugzilla + SQ')]");
	
	public WebElement getLogin()
	{
	WebElement signIn=driver.findElement(signInbutton);
	System.out.println(signIn);
	return signIn;
	
	}
	public WebElement getText()
	{
	WebElement signIn=driver.findElement(text);
//	System.out.println(text);
	return (WebElement) text;
	
	}
}
