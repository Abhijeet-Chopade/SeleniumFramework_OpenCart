package testCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pageObject.LoginPageOrange;
import pageObject.OrangeHRM_JobTitle;

public class TC02_OrangeHRM_JobTitle extends BaseClass {
	
	@Test
	
	public void Verify_OrangeHRM_JobTitle () throws AWTException, InterruptedException
	{
		
LoginPageOrange loginPageOrange = new LoginPageOrange(driver);
		
		loginPageOrange.setUsername(p.getProperty("username"));
		loginPageOrange.setPassword(p.getProperty("password"));
		loginPageOrange.clickLogin();
		
		OrangeHRM_JobTitle orangeHRM_JobTitle = new OrangeHRM_JobTitle(driver);
		
		orangeHRM_JobTitle.ClickOnAdmin();
		Thread.sleep(5000);
		orangeHRM_JobTitle.ClickOnJob();
		Thread.sleep(5000);
		orangeHRM_JobTitle.ClickOnJobTitle();
		Thread.sleep(5000);
		orangeHRM_JobTitle.ClickOnAddBtn();
		Thread.sleep(5000);
		
		orangeHRM_JobTitle.EnterText_JobTitle();
		Thread.sleep(5000);
		orangeHRM_JobTitle.EnterText_JobDescription();
		Thread.sleep(5000);
		orangeHRM_JobTitle.Enter_Note();
		Thread.sleep(5000);
		orangeHRM_JobTitle.ClickOnSaveButton();
		Thread.sleep(5000);
		
		orangeHRM_JobTitle.ClickOnCheckbox();
		Thread.sleep(5000);
		orangeHRM_JobTitle.ClickOnEditButton();
		Thread.sleep(5000);
		orangeHRM_JobTitle.Edit_Note();
		Thread.sleep(5000);
		orangeHRM_JobTitle.ClickOnSaveButton();
		Thread.sleep(5000);
		
		// String filePath = "C:\\Users\\Abhijeet\\Downloads\\JobSpecification_AutomationTester.pdf";
		
		// orangeHRM_JobTitle.uploadJobSpecification(filePath);
		
		
	}

}
