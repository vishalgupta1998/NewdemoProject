package Maven.AllInOne;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ReporterConfig.Property;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class Assert extends Base {
	
	WebDriver driver;
	@Test//(dataProvider="dataprovide")
	public void yesh() throws IOException
	{
		//Base accessdriver = new Base();
        driver= base();
        driver.get(prop.getProperty("Url"));
        LandingPage lg = new LandingPage(driver);
        //
        //assertEquals(lg.getText().getText(), "QA Expert Course :Software Testing + Bug");
        
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
