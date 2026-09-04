package pageObject;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testCases.BaseClass;

public class OrangeHRM_JobTitle extends BaseClass {
	
	@FindBy(xpath="//div[@class='oxd-sidepanel-body']/descendant::ul/li[1]")
	private WebElement tabAdmin;
	
	@FindBy(xpath="//div[@class='oxd-topbar-body']/descendant::ul/li[2]")
	private WebElement tabJob;
	
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']/descendant::li[1]")
	private WebElement dropJobTitle;
	
	@FindBy(xpath="//button[text()=' Add ']")
	private WebElement btnAdd;
	
	@FindBy(xpath="//label[text()='Job Title']/parent::div/following-sibling::div//input")
	private WebElement textboxJobTitle;
	
	@FindBy(xpath="//label[text()='Job Description']/parent::div/following-sibling::div//textarea")
	private WebElement textboxJobDescription;
	
	// @FindBy(xpath="//div[text()='Browse']")
	// private WebElement btnBrowse;
	
	By btnBrowse = By.xpath("//div[text()='Browse']");
	
	@FindBy(xpath="//div[@class='oxd-input-group__label-wrapper']/following-sibling::div/textarea[@placeholder='Add note']")
	private WebElement textNote;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnSave;
	
	@FindBy(xpath="//div[@class='oxd-table-body']/descendant::label[1]")
	private WebElement checkbox;
	
	@FindBy(xpath="//div[@class='oxd-table-body']/parent::div//following-sibling::button[2]")
	private WebElement btnEdit;
	
	
	
	public OrangeHRM_JobTitle (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnAdmin()
	{
		tabAdmin.click();
	}
	
	public void ClickOnJob()
	{
		tabJob.click();
	}
	
	public void ClickOnJobTitle()
	{
		dropJobTitle.click();
	}
	
	public void ClickOnAddBtn()
	{
		btnAdd.click();
	}
	
	public void EnterText_JobTitle()
	{
		textboxJobTitle.sendKeys("Automation Tester-02");
	}
	
	public void EnterText_JobDescription()
	{
		textboxJobDescription.sendKeys("Test feature using automation");
	}
	
	/* public void clickBrowse()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btnBrowse));
	}
	
	public void uploadJobSpecification (String filePath) throws AWTException
	{
		uploadFileUsingBrowse(btnBrowse, filePath);
	} */
	
	public void Enter_Note()
	{
		textNote.sendKeys("Perform Automation Testing Using Java Selenium");
	}
	
	public void ClickOnSaveButton()
	{
		btnSave.click();
	}
	
	public void ClickOnCheckbox()
	{
		checkbox.click();
	}
	
	public void ClickOnEditButton()
	{
		btnEdit.click();
	}
	
	public void Edit_Note()
	{
		textNote.sendKeys("Perform Automation Testing Using Java Selenium - Edit Functionality - 02");
	}
	
	public void Edit_ClickOnSaveButton()
	{
		btnSave.click();
	}
	

}
