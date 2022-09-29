

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclase.ZohoBaseClass;

import ZohoPom.Loginpage;
import ZohoProperties.ConfigrationHelper;

public class ZOHO extends ZohoBaseClass{
	public static WebDriver driver;

public static void main(String[] args)  throws InterruptedException, IOException {
	String browser = ConfigrationHelper.getInstance().getBrowser();
	driver=browserLaunch(browser);
	Loginpage log=new Loginpage(driver);
	String url = ConfigrationHelper.getInstance().getUrl();
	launchUrlBaseClass(url);
    clickOnElement(log.getSignup());
    
    String email2 = ConfigrationHelper.getInstance().getEmail();
    userInput(log.getEmail(), email2);
    
    String password = ConfigrationHelper.getInstance().getPassword();
    userInput(log.getPassword(), password);
    
    clickOnElement(log.getButton());
    
    clickOnElement( log.getLogin());
   
    
}


}
