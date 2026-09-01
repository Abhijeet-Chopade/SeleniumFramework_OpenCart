package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOrange {
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement txtUsername;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement txtPassword;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement btnLogin;
	
	public LoginPageOrange (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername (String username)
	{
		txtUsername.sendKeys(username);
	}
	
	public void setPassword (String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	

}
