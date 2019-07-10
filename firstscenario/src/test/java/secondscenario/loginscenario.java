/*package secondscenario;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TMAloginpage;
public class loginscenario {
	WebDriver driver;
	@Before
	public void initlogin() {
		String chromepath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium_training\\selenium_training_eclipse_workspace_reloaded\\New folder\\jar\\New folder\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver, TMAloginpage.class);
	}
	@Given("user enters the login page {string}")
	public void user_enters_the_login_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.get(string);
		Assert.assertTrue(driver.getCurrentUrl().contains("TestMeApp"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}

	@When("user enters username {string}")
	public void user_enters_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
		TMAloginpage.username.sendKeys(string);
	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAloginpage.password.sendKeys(string);
		
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAloginpage.login.click();
	}

	@Then("user logsin")
	public void user_logsin() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Assert.assertTrue(TMAloginpage.signout.isEnabled());
	}

}
*/