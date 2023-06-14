package HugsForBugs.POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HugsForBugs.Base.BaseClass;


public class LogOutPOM extends BaseClass {
  WebDriver driver;
  
  
  @FindBy(css="#nav-hamburger-menu")
public WebElement icon;
  @FindBy(linkText="Sign Out")
public WebElement signout;
  
  public WebElement getIcon() {
	return icon;
  }
public WebElement getSignout() {
	return signout;
}

  
public LogOutPOM(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
  
 
}
