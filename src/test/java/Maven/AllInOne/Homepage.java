package Maven.AllInOne;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class Homepage {
	@Test(dataProvider="dataprovide")
	public void yesh(String email,String Pass,String text) throws IOException
	{
		Base accessdriver = new Base();
        WebDriver driver= accessdriver.base();
        driver.get("http://www.qaclickacademy.com/");
        LandingPage lg = new LandingPage(driver);
        lg.getLogin().click();
        LoginPage obj = new LoginPage(driver);
        obj.email().sendKeys(email);
        obj.pass().sendKeys(Pass);
        System.out.println(text);
        obj.login().click();
        
	}
	@DataProvider
	public Object[][] dataprovide()
	{
		Object data[][] = new Object[2][3];
		data[0][0]="Predicted@gmail.com";
		data[0][1]="PassHello";
		data[0][2]="hey";
		
		
		data[1][0]="Predictedemail2@gmail.com";
		data[1][1]="Pass2Hi";
		data[1][2]="hi";
		return data;
		
		
	}
	

}
