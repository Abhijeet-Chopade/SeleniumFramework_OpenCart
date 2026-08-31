package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//span[text()='My Account']/following-sibling::span")
	private WebElement lnkMyaccount;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement lnkRegister;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement linkLogin;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClicklnkMyaccount()
	{
		lnkMyaccount.click();
	}
	
	public void ClicklnkRegister()
	{
		lnkRegister.click();
	}
	
	public void ClickLogin()
	{
		linkLogin.click();
	}
	
	
}
