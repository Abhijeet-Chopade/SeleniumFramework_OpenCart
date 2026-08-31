package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage {
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement txtTelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement txtConfirmPassword;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement chkdPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement btnContinue;
	
	public  AccountRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String telephone)
	{
		txtTelephone.sendKeys(telephone);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void setConfirmPassword(String password)
	{
		txtConfirmPassword.sendKeys(password);
	}
	
	public void setPrivacyPolicy()
	{
		chkdPolicy.click();
	}
	
	public void clickContinue()
	{
		btnContinue.click();
	}

	
	

}
