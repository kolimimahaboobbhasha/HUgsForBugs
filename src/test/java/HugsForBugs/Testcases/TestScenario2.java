package HugsForBugs.Testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import HugsForBugs.Base.BaseClass;
import HugsForBugs.POMpages.Buyproduct;
import HugsForBugs.POMpages.Checkout;
import HugsForBugs.POMpages.LogOutPOM;
import HugsForBugs.POMpages.LoginPage;

public class TestScenario2 extends BaseClass {
	
	@Test
	public void applaunchTest() throws Throwable
	{
		//Login into Amazon
		LoginPage app=new LoginPage(driver);
		app.username();
		app.Click();
		app.password();
		app.Click();
      	app.pword2();
		app.signin();
     	app.Click();
		

//Logout
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
