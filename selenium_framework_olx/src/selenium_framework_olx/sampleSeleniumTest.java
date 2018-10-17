package selenium_framework_olx;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sampleSeleniumTest {
	
	public static void main(String[] args) throws InterruptedException{

	//Create Driver Object
	
	     WebDriver driver = new SafariDriver();
	     
	     driver.get("https://dubai.dubizzle.com");
	     
	   WebElement element = driver.findElement(By.linkText("Property for Rent"));
	   
       WebDriverWait wait = new WebDriverWait (driver, 10);
	   
	   Actions action = new Actions(driver);
	   
       action.moveToElement(element).build().perform();

       
       driver.findElement(By.linkText("Apartment/Flat for Rent")).click();
       
       System.out.println("Redirected sucessfully to the new page");
	     
	     
	}    
	/*
	 * This function is used to select the browser and OS on which the test needs to be perfromed
	 */
	
/*	public selectBrowserandOS() {
	if(OS = mac) {	
		
		switch(){
		
		case 1: (Safari)
			
		case 2:(Chrome)
			
		case 3:(Firefox)
			
		}
		
		else 
			
			switch() {
			
			case 1:(IE)
			
			case 2:(Chrome)
			
		    case 3:(Firefox)
				
			}	
		
			
		
	}
	     
	*/     
}
