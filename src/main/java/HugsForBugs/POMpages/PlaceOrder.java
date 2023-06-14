package HugsForBugs.POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import HugsForBugs.Base.BaseClass;

public class PlaceOrder extends BaseClass {
	WebDriver driver;
	public PlaceOrder(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath="//span[text()='Net Banking']")
	private WebElement clickonpay;

	
	public void ClickonPayment() throws InterruptedException
	{
//		wlib.scrollActionby(driver);
//		Thread.sleep(3000);
//		clickonpay.click();
	}
}
