package DriverSetup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver {

	public static WebDriver driver;
	   public static ChromeOptions Coptions;
	   public static EdgeOptions Eoptions;
	   public static WebDriver chromedriver() throws AWTException, InterruptedException {
		   WebDriverManager.chromedriver().setup();
		   Coptions= new ChromeOptions();
		   Coptions.addArguments("--start-maximized");
	       Coptions.addArguments("disable-notifications");
		   Coptions.addArguments("disable-popup-blocking");
		   Coptions.addArguments("disable-blink-features-AutomationControlled");
		   driver= new ChromeDriver(Coptions);
		   driver.get("https://www.makemytrip.com/");
		   		   
		   Thread.sleep(3000);
		    
//	        try {
//	            // Wait for the alert to appear
//	            Thread.sleep(2000); // Adjust the wait time as needed
//
//	            // Switch to the alert and click "Allow"
//	            driver.switchTo().alert().accept();
//
//	            // Switch back to the default content (main page)
//	            driver.switchTo().defaultContent();
//
//	            
//	        } catch (Exception e) {
//	            System.err.println("Error handling location access alert: " + e.getMessage());
//	        } 
//	        try {
//				driver.switchTo().frame(driver.findElement(By.xpath("//div[@class=\"intervention-popup-container \"]/div[@class=\"intervention-popup  \"]/div[@class=\"intervention-close\"]")));
//			WebElement close_popup = driver.findElement(By.cssSelector("div.intervention-close"));
//			close_popup.click();
//			driver.switchTo().defaultContent();
//			} catch(Exception e) {
//				e.printStackTrace();
//			}

		   return driver;
	   }
	   public static WebDriver edgedriver() {
		   WebDriverManager.edgedriver().setup();
		   Eoptions= new EdgeOptions();
		   Eoptions.addArguments("--statrt-maximized");
		   //Eoptions.addArguments("incognito");
		   Eoptions.addArguments("disable-notifications");
		   Eoptions.addArguments("disable-popup-blocking");
		//   Eoptions.addArguments("headless");
		   Eoptions.addArguments("disable-blink-features-AutomationControlled");
		   driver= new EdgeDriver(Eoptions);
		   driver.get("https://www.makemytrip.com/");
		   return driver;
	   }
	}
