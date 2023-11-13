package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_loginPage 
{
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	

	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	

	@FindBy(id="loginButton")
	private WebElement loginButton;
	

	@FindBy(xpath="//a[contains(text(),'password?']")
	private WebElement forgotyourpasswordLink;
	

	@FindBy(xpath="//a[.='actiTIME Inc']")
	private WebElement actitimeincLink;
	
	public Actitime_loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod()
	{
		usernameTextField.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		keepmeloggedinCheckbox.click();
		loginButton.click();
	}
	
 
	
	public void forgotyourpasswordMethod()
	{
		System.out.println(forgotyourpasswordLink.getText());
		forgotyourpasswordLink.click();
	}
	public void actitimeincMethod()
	{
		System.out.println(actitimeincLink.getText());
		actitimeincLink.click();
}

}
