package testCases;

import org.testng.annotations.Test;

import pageObject.LoginPageOrange;

public class TC_01_OrangeHRM_Login extends BaseClass {
	
	@Test
	
	public void Verify_OrangeHRM_Login ()
	{
		LoginPageOrange loginPageOrange = new LoginPageOrange(driver);
		
		loginPageOrange.setUsername(p.getProperty("username"));
		loginPageOrange.setPassword(p.getProperty("password"));
		loginPageOrange.clickLogin();
		
	}

}
