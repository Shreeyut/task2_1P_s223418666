package sit707_week2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:/Users/guest1/Downloads/chromedriver-win64(1)/chromedriver-win64/chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		driver.manage().window().maximize();
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);		
		element.sendKeys("Shreeyut");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		WebElement element2 = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + element2);		
		element2.sendKeys("Shrestha");
		
		WebElement element3 = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + element3);		
		element3.sendKeys("0416463309");
		
		WebElement element4 = driver.findElement(By.id("email"));
		System.out.println("Found element: " + element4);		
		element4.sendKeys("Shreeyutshrestha@hotmail.com");
		
		WebElement element5 = driver.findElement(By.id("password"));
		System.out.println("Found element: " + element5);		
		element5.sendKeys("Password1!");
		
		WebElement element6 = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + element6);		
		element6.sendKeys("Password1");
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		WebElement button = driver.findElement(By.xpath("//button[text()='Create account']"));
		System.out.println("Found element: " + button);
		button.click();
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Path to the location to save screenshot
		try {
			FileUtils.copyFile(source, new File("C:/Users/guest1/Pictures/uni/707/screen2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sleep(2);
		System.out.println("Screenshot is captured");
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		//driver.close();	
	}
	public static void battwrld_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:/Users/guest1/Downloads/chromedriver-win64(1)/chromedriver-win64/chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		
		driver.get(url);
		driver.manage().window().maximize();
	

		WebElement element = driver.findElement(By.id("register-firstname"));
		System.out.println("Found element: " + element);
	
		element.sendKeys("Shreeyut");
		
		
		WebElement element2 = driver.findElement(By.id("register-lastname"));
		System.out.println("Found element: " + element2);
		element2.sendKeys("Shrestha");
		
		
		
		WebElement element4 = driver.findElement(By.id("register-email"));
		System.out.println("Found element: " + element4);		
		element4.sendKeys("Shreeyutshrestha@hotmail.com");
		
		WebElement element5 = driver.findElement(By.id("register-password"));
		System.out.println("Found element: " + element5);
		element5.sendKeys("Password1!");
		
		WebElement element6 = driver.findElement(By.id("register-password2"));
		System.out.println("Found element: " + element6);
		element6.sendKeys("Password1!");
		
		
	
		WebElement button = driver.findElement(By.xpath("//button[text()=' Create Account ']"));
		System.out.println("Found element: " + button);
		button.click();
		sleep(10);
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Path to the location to save screenshot
		try {
			FileUtils.copyFile(source, new File("C:/Users/guest1/Pictures/uni/707/screen4.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sleep(2);
		System.out.println("Screenshot is captured");
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		//driver.close();	
	}

	
}
