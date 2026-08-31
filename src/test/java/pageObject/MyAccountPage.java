package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	@FindBy(xpath="//h2[text()='My Account']")
	private WebElement msgHeading;
	
	@FindBy(xpath="//div[@class='list-group']//a[text()='Logout']")
	private WebElement lnkLogout;
	
	public MyAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean isMyAccountPageExists()
	{
		try
		{
			return (msgHeading.isDisplayed());
		} catch (Exception e)
		{
			return (false);
		}
		
	}
	
	public void clickLogout ()
	{
		lnkLogout.click();
	}
	
	

}
