package HugsForBugs.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import HugsForBugs.Base.BaseClass;
import HugsForBugs.POMpages.Buyproduct;
import HugsForBugs.POMpages.Checkout;
import HugsForBugs.POMpages.LogOutPOM;
import HugsForBugs.POMpages.LoginPage;

public class TestScenario1 extends BaseClass{

	@Test
	public void loginandlogout() throws Throwable
	{
		LoginPage app=new LoginPage(driver);
		app.username();
		app.Click();
		app.password();
		app.Click();
      	app.pword2();
		app.signin();
		
		
		Buyproduct page=new Buyproduct(driver);
		page.search();
		page.SelectproductinList();
		page.addproducttocart();
		
		Checkout checkoutpage=new Checkout(driver);
		checkoutpage.checkout();
		checkoutpage.paymentandshippinginfo();
		checkoutpage.firstname();
		checkoutpage.mobile();
		checkoutpage.Pincode();
		checkoutpage.Address();
		checkoutpage.Area();
		checkoutpage.LandMark();
		checkoutpage.City();
		checkoutpage.Clickonaddress();
		checkoutpage.verifyInfo();
		
		
		LogOutPOM logout = new LogOutPOM(driver);
		logout.icon.click();
		wlib.scrollActionby(driver);
		logout.signout.click();
		String Title = driver.getTitle();
		System.out.println(Title);
		String Actual = property.ReadDatafrompropertyfile("ExpectedUrl");
		Assert.assertEquals(Title, Actual);
		System.out.println("It came back to Amazon Sign in");
	}
}
