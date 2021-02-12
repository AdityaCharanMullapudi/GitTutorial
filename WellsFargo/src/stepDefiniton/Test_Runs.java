package stepDefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test_Runs {
	
	private static WebDriver driver = null;
	
	
			
	@Given("User is on the Home page.")
	public void user_is_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u736288\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		   
		   driver.get("https://www.wellsfargo.com");
		   
		   if(driver.findElement(By.id("signOnMain"))!=null) {
			   System.out.println("page loaded");
		   }
		   else {
	    throw new io.cucumber.java.PendingException();
	}
	}

	@When("I click on the ForgotPassword\\/Username link")
	public void i_click_on_the_forgot_password_username_link() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if(driver.findElement(By.className("forgotPasswordLinkWrapper"))!=null) {
			
			driver.findElement(By.className("forgotPasswordLinkWrapper")).click();
			System.out.println("link clicked");
		}
		else {
		
		
	    throw new io.cucumber.java.PendingException();
	}
	}

	@Then("I should navigate to ForgotPassword\\/Username page")
	public void i_should_navigate_to_forgot_password_username_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		if(driver.findElement(By.cssSelector("h1#skip.c11"))!=null) {
			System.out.println("forgotpassword/username page is displayed");
		}
		else {
		
	    throw new io.cucumber.java.PendingException();
	}
	}

	@Then("Create New Password link should be displayed.")
	public void create_new_password_link_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		
		if(driver.findElement(By.linkText("Create New Password"))!=null) {
			System.out.println("link is displayed");
			driver.findElement(By.className("tabNavLink")).click();
		} else {
			
			Exception e = new Exception();
			e.printStackTrace();
		}
	   // throw new io.cucumber.java.PendingException();
	}
	
	@When("entered {string} in the usernamefield")
	public void entered_in_the_usernamefield(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("userid")).sendKeys(string);
		
	    //throw new io.cucumber.java.PendingException();
	}

	@When("entered {string} in the passwordfield")
	public void entered_in_the_passwordfield(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("password")).sendKeys(string);
	    //throw new io.cucumber.java.PendingException();
}

	@When("clicked on SignOn button")
	public void clicked_on_sign_on_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnSignon")).click();
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("warning message should be displayed saying account is suspended")
	public void warning_message_should_be_displayed_saying_account_is_suspended() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		}
	   // throw new io.cucumber.java.PendingException();
	

	@Then("ForgotPassword\\/username link should be displayed")
	public void forgot_password_username_link_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		if(driver.findElement(By.linkText("Forgot Password/Username?"))!=null) {
			System.out.println("link is displayed");
			driver.findElement(By.id("backToPreviousPageLink")).click();
			
		}
		//driver.quit();
	   // throw new io.cucumber.java.PendingException();
	}
	
	@When("entered username and password")
	public void entered_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	    
	List<List<String>> data = dataTable.asLists();
	driver.findElement(By.id("userid")).sendKeys(data.get(0).get(0));
	driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
				
	   // throw new io.cucumber.java.PendingException();
	}
	@When("entered the username and password")
	public void entered_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	    
		List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		driver.findElement(By.id("userid")).sendKeys(data.get(0).get("User_name"));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
		
	    //throw new io.cucumber.java.PendingException();
	}




}
