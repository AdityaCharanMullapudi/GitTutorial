package stepDefiniton;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CovidAlert {
	
	private static WebDriver driver = null;
	
	@Before
	@Given("User is on the Home page")
	public void user_is_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u736288\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		   
		   driver.get("https://www.wellsfargo.com");   
		
		   if(driver.findElement(By.cssSelector("div.c3"))!=null) {
			   
			   System.out.println("Home page is displayed");
		   }
		
	    //throw new io.cucumber.java.PendingException();
	}

	@When("Alert icon is displayed on home page")
	public void alert_icon_is_displayed_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		if(driver.findElement(By.cssSelector("span.emergencyMsgSpan.theme4"))!=null) {
			System.out.println("Alert icon is displayed");
		}
		else {
			Exception e = new Exception();
			e.printStackTrace();
		}
		
	   // throw new io.cucumber.java.PendingException();
	}

	@When("clicked on the Learn more link")
	public void clicked_on_the_learn_more_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.linkText("Learn more")).click();
	}

	@Then("Covid Resources and Support page should be displayed")
	public void covid_resources_and_support_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@After
	@Then("User should be able to navigate back to Home page.")
	public void user_should_be_able_to_navigate_back_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

}
