package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public Properties p;
	
	@BeforeClass (groups = {"Master", "Sanity", "Regression"})     // Step 8 groups added
	@Parameters({"os", "browser"})
	
	public void setup(String os, String br) throws IOException
	{
		
		// Loading config.properties file
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		p = new Properties();
		p.load(file);
		
		switch(br.toLowerCase())
		{
		    case "chrome": driver = new ChromeDriver();
		                   break;
		                   
		    case "edge": driver = new EdgeDriver();
		                  break;
		                     
		}
		// driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(p.getProperty("appURLOrangeHRM"));     // Reading URL from properties file
		driver.manage().window().maximize();
		
	}
	
	/* @AfterClass (groups = {"Master", "Sanity", "Regression"})      // Step 8 groups added 
	
	 public void tearDown()
	{
		driver.close();
	} */
	
	public String randomeString()
	{
	   String generatedString	= RandomStringUtils.randomAlphabetic(5);
	   return generatedString;
	}
	
	public String randomNumber()
	{
	  String generatedString = RandomStringUtils.randomNumeric(10);
	  return generatedString;
	}
	
	public String randomAlphaNumeric()
	{
		String str	= RandomStringUtils.randomAlphabetic(3);
		String num = RandomStringUtils.randomNumeric(3);
		
		return (str+"@"+num);
		
	}
	
	public String captureScreen(String tname) throws IOException {
		
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
	    File sourceFile = takeScreenshot.getScreenshotAs(OutputType.FILE);
	    
	    String targetFilePath = System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
	    File targetFile = new File(targetFilePath);
	    
	    sourceFile.renameTo(targetFile);
	    
	    return targetFilePath;
	   
		
	}
	
	
	
	public void uploadFileUsingBrowse(By browseButton, String filePath) throws AWTException
	{
		
		WebDriverWait wait =
		        new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Browse']"))
		).click();
		
		Robot robot = new Robot();
		
		StringSelection file = new StringSelection(filePath);
		
		Toolkit.getDefaultToolkit()
		.getSystemClipboard()
		.setContents(file, null);
		
		robot.delay(1000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.delay(500);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.delay(1000);
		
		
	}
	
	
  }
