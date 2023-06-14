package HugsForBugs.POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HugsForBugs.Base.BaseClass;

public class Checkout extends BaseClass {
	WebDriver driver;
	public Checkout (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@id='addressChangeLinkId']")
	private WebElement checkout;
	@FindBy(xpath="//a[@id='add-new-address-popover-link']")
	private WebElement information;
	@FindBy(xpath="//input[@name='address-ui-widgets-enterAddressFullName']")
	private WebElement fname;
	@FindBy(xpath ="//input[@name='address-ui-widgets-enterAddressPhoneNumber']")
	private WebElement mobileno;
	@FindBy(xpath ="//input[@id='address-ui-widgets-enterAddressPostalCode']")
	private WebElement pincode;
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	private WebElement address;
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	private WebElement area;
	@FindBy(xpath="//input[@id='address-ui-widgets-landmark']")
	private WebElement landmark;
	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressCity']")
	private WebElement City;
	@FindBy(xpath="//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']")
	private WebElement clickonaddress;
	@FindBy(xpath = "//span[text()='4-101, Hrg colony, ANANTAPUR, ANDHRA PRADESH, 515872, India, Phone number: 7036953585']")
	private WebElement verifyinfo;
	@FindBy(xpath = "//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']")
	private WebElement useaddress;
	
	
	public void checkout() {
		checkout.click();
	}
	public void paymentandshippinginfo() throws InterruptedException { 
		Thread.sleep(4000);
		if(information.isDisplayed()) 
		{
			System.out.println("payment and shipping inforamtion are editable");
			
		}
		else {
			System.out.println("payment and shipping information is not displayed");
		}
		information.click();
	}
	public void firstname() throws Throwable
	{
		fname.sendKeys(property.ReadDatafrompropertyfile("Name"));
	}
	public void mobile() throws Throwable
	{
		mobileno.sendKeys(property.ReadDatafrompropertyfile("Mobile"));
	}
	public void Pincode() throws Throwable
	{
		pincode.sendKeys(property.ReadDatafrompropertyfile("Pincode"));
	}
	public void Address() throws Throwable
	{
		address.sendKeys(property.ReadDatafrompropertyfile("Address"));
	}
	public void Area() throws Throwable
	{
		area.sendKeys(property.ReadDatafrompropertyfile("Area"));
	}
	public void LandMark() throws Throwable
	{
		landmark.sendKeys(property.ReadDatafrompropertyfile("Landmark"));
	}
	public void City() throws Throwable
	{
		City.sendKeys(property.ReadDatafrompropertyfile("City"));
	}
	public void Clickonaddress() {
		clickonaddress.click();
	}
	public void verifyInfo() {
		if(verifyinfo.isDisplayed()) {
			System.out.println("Verified that the information is entered correctly.");
		}
		else {
			System.out.println("Verified that the information is entered Wrongly.");
		}
	}
		public void usethisADDRESS() throws InterruptedException
		{
			useaddress.click();
			driver.navigate().back();
		}
	
}