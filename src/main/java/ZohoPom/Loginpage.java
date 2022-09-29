package ZohoPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public static WebDriver driver;

	public Loginpage(WebDriver driver1) {
		this.driver = driver1;
         PageFactory.initElements(driver, this);
	}

	

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getLogin() {
		return login;
	}



	@FindBy(xpath = "//a[text()='Sign Up Now']")
	private WebElement signup;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(className = "unchecked")
	private WebElement button;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement login;

}
