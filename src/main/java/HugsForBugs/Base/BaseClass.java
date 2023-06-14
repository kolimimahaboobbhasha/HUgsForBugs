package HugsForBugs.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import Utility.ListenerImplementation;
import Utility.LogUtility;
import Utility.PropertyUtility;
import Utility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(ListenerImplementation.class)
public class BaseClass {
	protected static WebDriverUtility wlib=new WebDriverUtility();
	protected static PropertyUtility property=new PropertyUtility();
	LogUtility log=new LogUtility();
	public static WebDriver driver=null;
	public static WebDriver sdriver;
	
	@Parameters("Browser")
	@BeforeClass
	public void setBrowser(String Browser) throws Throwable
	{
		if(Browser.equalsIgnoreCase("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	
			
			}
		else if(Browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			}
	
	else if(Browser.equalsIgnoreCase("Internet Explorer"))
	{
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		}
	else if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			log.info("successfully login");
			}
	else if(Browser.equalsIgnoreCase("IOS"))
	{
		WebDriverManager.safaridriver().setup();
		driver=new SafariDriver();
		}
	else {
		System.out.println("Invalid Browser");
	}
		sdriver=driver;
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		log.info("successfully login");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(property.ReadDatafrompropertyfile("url"));
		WebElement signin=driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
		wlib.mouseHoverOn(driver, signin);
		signin.click();
		
		
		
		
	}
	@AfterTest
	public void appclose()
    {
	  //driver.close();
	}
	



}
