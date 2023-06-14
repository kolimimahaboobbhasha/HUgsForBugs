package HugsForBugs.POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.PropertyUtility;

public class LoginPage {
	 PropertyUtility properties=new  PropertyUtility();
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css = "input#ap_email")
	private WebElement uname;
	@FindBy(css="input#continue")
	private WebElement Continue;
	@FindBy(css="input#ap_password")
	private WebElement pword;
	@FindBy(css="input#signInSubmit")
	private WebElement loginbutton;
	@FindBy(css="#ap_password")
	private WebElement pword2;
	@FindBy(css="#signInSubmit")
	private WebElement signin;

	public void username() throws Throwable
	{
	uname.sendKeys(properties.ReadDatafrompropertyfile("username"));
	}
	public void Click() {
		Continue.click();
	}
	public void password() throws Throwable
	{
		pword.sendKeys(properties.ReadDatafrompropertyfile("password"));
	}
	public void login() throws InterruptedException {
		loginbutton.click();
		
	}
	public void pword2() throws Throwable
	{
		pword2.sendKeys(properties.ReadDatafrompropertyfile("password"));
		
	}
	public void signin() throws Throwable
	{
		signin.click();
		
		
	}

	

}
