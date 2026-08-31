package testCases;

import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.HomePage;

public class TC_001_AccountRegistrationTest extends BaseClass {
	
	@Test (groups= {"Regression", "Master"})     // Step8 groups added
	
	public void verify_account_registration()
	{
		
		HomePage hp = new HomePage(driver);
		hp.ClicklnkMyaccount();
		hp.ClicklnkRegister();
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setTelephone(randomNumber());
		
		String password = randomAlphaNumeric();
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();                             
		
		
		
		
		
	}

}
