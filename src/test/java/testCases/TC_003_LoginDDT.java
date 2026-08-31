package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String email, String password, String exp)
	{
		try
		 {
		
			
	    HomePage hp = new HomePage(driver);
		
		hp.ClicklnkMyaccount();
		hp.ClickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(password);
		lp.clickLogin();
		
		MyAccountPage macc = new MyAccountPage(driver);
		
	  boolean targetPage = macc.isMyAccountPageExists();
	  
	  if(exp.equalsIgnoreCase("Vaild"))
	  {
		  if (targetPage==true)
		  {
			  macc.clickLogout();
			  Assert.assertTrue(true);
		  }
		  else
		  {
			  Assert.assertTrue(false);
		  }
	  }
	  
	  if (exp.equalsIgnoreCase("Invalid"))
	  {
		  if (targetPage ==true)
		  {
			  macc.clickLogout();
			  Assert.assertTrue(false);
		  }
		  else
		  {
			  Assert.assertTrue(true);
		  }
	  }
		}
	  
	  catch(Exception e)
	  {
		  Assert.fail("An exception occured: " + e.getMessage());
	  }
		
	}
  }
