package withoutFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Open Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// To Enter URL
		driver.get("https://tutorialsninja.com/demo/index.php");
		
		// Wait
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Click on My Account
		 WebElement myAccountDropdown = driver.findElement(By.xpath("//span[text()='My Account']/following-sibling::span"));
		 myAccountDropdown.click();
		 Thread.sleep(2000);
		 
		 // Click on Login Option
		 WebElement loginOption = driver.findElement(By.xpath("//a[text()='Login']"));
		 loginOption.click();
		 Thread.sleep(2000);
		 
		 // Enter Email Address
		WebElement mailAddress = driver.findElement(By.xpath("//input[@name='email']"));
		mailAddress.sendKeys("virajvelocity@gmail.com");
		
		// Enter Password
         WebElement	password = driver.findElement(By.xpath("//input[@name='password']"));
         password.sendKeys("Velocity@1234");
         Thread.sleep(2000);
         
       // Click On Login Button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
        loginButton.click();
        
       // Verify Account text is present on process flow formatter or not
        String ExceptedResult = "Account";
        
       WebElement S1 = driver.findElement(By.xpath("//a[text()='Account']"));
       String ActualResult = S1.getText();       // Account
       
       if(ExceptedResult.equals(ActualResult))
       {
    	   System.out.println("Pass");
       }
       else
       {
    	   System.out.println("Fail");
       }
       
       Thread.sleep(1000);
       
       // Logout from app
      WebElement logout = driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Logout']"));
      logout.click();
      
      // Close Browser
      driver.close();
		
		
		 
		 

		
		
		
		
		
		

	}

}
