package testCases;

import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;

public class TC_002_LoginTest extends BaseClass {
	
	@Test (groups = {"Sanity", "Master"})    // Steps8 group added
	
	public void verify_login()
	{
		
		HomePage hp = new HomePage(driver);
		hp.ClicklnkMyaccount();
		hp.ClickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
	}

}
