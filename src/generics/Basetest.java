package generics;

import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.annotation.ManagedAttribute;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Actitime_Homepage;
import pom.Actitime_loginPage;
import pom.Types_Leave;




public class Basetest 
{
	public WebDriver driver;
	@BeforeClass
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
	@BeforeMethod
	
		public void Logintap()
		{
		Actitime_loginPage login=new Actitime_loginPage(driver);
				login.loginMethod();
}
 @AfterMethod
	public void logouttap1()
	{
		Actitime_Homepage home=new Actitime_Homepage(driver);
	    home.logoutMethod();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	
}
	
