package HugsForBugs.POMpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import HugsForBugs.Base.BaseClass;
import Utility.PropertyUtility;
import Utility.WebDriverUtility;




public class Buyproduct extends BaseClass {
	WebDriverUtility wlib=new WebDriverUtility();
	PropertyUtility property=new PropertyUtility();
	 WebDriver driver;
	public Buyproduct(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox;
	@FindBy(xpath = "//img[@class='s-image'][1]")
	private WebElement selectproduct;
	@FindBy(xpath="//input[@id='buy-now-button']")
	private WebElement buyproduct;
	@FindBy(id="attach-accessory-proceed-to-checkout-text")
    private WebElement pro ;
	
	public void search() throws Throwable
	{
		WebElement search=searchbox;
		search.sendKeys(property.ReadDatafrompropertyfile("item"));
		search.sendKeys(Keys.ENTER);
		
	}
	public void SelectproductinList() throws InterruptedException
	{
	
		selectproduct.click();
		
	}
	public void addproducttocart() throws Throwable
	{

		wlib.windowHandles(driver, 1);
		wlib.scrollActionby(driver);
		buyproduct.click();
		String title=driver.getTitle();
		String Actual=property.ReadDatafrompropertyfile("CheckoutTitle");
		Assert.assertEquals(title,Actual);
				
	//	addtocart.click();	
		//pro.click();
		//driver.navigate().back();
		//driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
	}
	
//	public void proce() throws InterruptedException
//	{
//		Actions aa=new Actions(driver);
//		aa.moveToElement(pro).click().build().perform();
//	
//	}
	
	

}
