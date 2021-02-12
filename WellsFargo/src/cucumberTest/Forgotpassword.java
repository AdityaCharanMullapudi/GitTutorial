package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Forgotpassword {
		private static WebDriver driver = null;
		
	public static void main(String[] args) {
		// Create a new instance of the Chrome driver

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u736288\\Downloads\\chromedriver_win32\\chromedriver.exe");

		   driver = new ChromeDriver();

		        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		        //Launch the Online Store Website

		        driver.get("https://www.WellsFargo.com");

		        driver.findElement(By.className("forgotPasswordLinkWrapper")).click();

		       
		        // Close the driver

		        driver.quit();

	}

}