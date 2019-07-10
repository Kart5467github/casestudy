/*package thirdscenario;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TMAloginpage;
import pages.TMAsearch;

public class searchscenario {
	WebDriver driver;
	@Before
	public void enterTMA(){
		String chromepath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium_training\\selenium_training_eclipse_workspace_reloaded\\New folder\\jar\\New folder\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		PageFactory.initElements(driver, TMAsearch.class);
		PageFactory.initElements(driver, TMAloginpage.class);
	}
	@Given("user logs in to TMA")
	public void user_logs_in_to_TMA() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAloginpage.username.sendKeys("Lalitha");
		TMAloginpage.password.sendKeys("Password123");
		TMAloginpage.login.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@When("user enters the productname as {string}")
	public void user_enters_the_productname_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsearch.searchbox.sendKeys("head");
		
	}
	@When("user clicks on finddetails button")
	public void user_clicks_on_finddetails_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsearch.finddetailsbutton.click();
	}
	@When("user gets the results in productspage")
	public void user_gets_the_results_in_productspage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Assert.assertTrue(driver.getCurrentUrl().contains("findProduct"));
	}

	@When("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		TMAsearch.addtocart.click();
	}

	@When("user clicks on cart button")
	public void user_clicks_on_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsearch.cartbutton.click();
	}

	@When("user proceeds to payment page")
	public void user_proceeds_to_payment_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsearch.checkout.click();
		TMAsearch.ProceedtoPay.click();
		
	}

	@When("user selects bank and continues")
	public void user_selects_bank_and_continues() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		

	}

	@When("user user enters {string} as username and {string} as password and clicks login")
	public void user_user_enters_as_username_and_as_password_and_clicks_login(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsearch.bankusername.sendKeys(string);
		TMAsearch.bankpassword.sendKeys(string2);
		TMAsearch.bankloginbutton.click();
	}

	@When("user enters {string} as Transactionpassword")
	public void user_enters_as_Transactionpassword(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    ///throw new cucumber.api.PendingException();
		TMAsearch.Transpassword.sendKeys(string);
		TMAsearch.Paynow.click();
		//TMAsearch.co
	}

	@Then("user user enters order confirmationpage")
	public void user_user_enters_order_confirmationpage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Assert.assertTrue(driver.getCurrentUrl().contains("fromPayment"));
	}


	

}
*/