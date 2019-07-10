/*package firstscenario;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TMAsignup;
public class registerscenario {
	WebDriver driver;
	@Before
	public void initbrowser(){
		String chromepath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium_training\\selenium_training_eclipse_workspace_reloaded\\New folder\\jar\\New folder\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver, TMAsignup.class);
	}
	@Given("url of tma website {string}")
	public void url_of_tma_website(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.get(string);
		Assert.assertTrue(driver.getCurrentUrl().contains("TestMeApp"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		TMAsignup.SignUp.click();
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsignup.username.sendKeys("User1234");;
		
	}

	@When("user enters {string} as firstname")
	public void user_enters_as_firstname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsignup.firstname.sendKeys("Tester");
	}

	@When("user enters {string} as lastname")
	public void user_enters_as_lastname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsignup.lastName.sendKeys("team");
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsignup.password.sendKeys("abc123");
	}

	@When("user enters {string} as confirmpassword")
	public void user_enters_as_confirmpassword(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsignup.pass_confirmation.sendKeys("abc123");
	}

	@When("user selects {string} as male|female")
	public void user_selects_as_male_female(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//Select genderselect=new Select(TMAsignup.gender);
		//genderselect.selectByValue("411010");
		TMAsignup.gendermale.click();
		
	}

	@When("user enters {string} as email")
	public void user_enters_as_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		TMAsignup.emailAddress.sendKeys("abc123@email.com");
	}

	@When("user enters {string} as mobile number")
	public void user_enters_as_mobile_number(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		TMAsignup.mobileNumber.sendKeys(string);
	}

	@When("user enters {string} as dateofbirth")
	public void user_enters_as_dateofbirth(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsignup.dob.sendKeys(string);
	}

	@When("user enters {string} as address")
	public void user_enters_as_address(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsignup.address.sendKeys(string);
	}

	@When("user enters security question")
	public void user_enters_as_security_question() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Select selectsecurityquestion =new Select(TMAsignup.securityQuestion);
		selectsecurityquestion.selectByValue("411011");
	}

	@When("user enters {string} as answer")
	public void user_enters_as_answer(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsignup.answer.sendKeys(string);
	}

	@When("user clicks on register")
	public void user_clicks_on_register() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsignup.Register.click();
	}

	@Then("user enters productpage")
	public void user_enters_productpage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Assert.assertTrue(TMAsignup.Home.isEnabled());
	}

}
*/

