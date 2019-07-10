package fourthscenario;
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

public class addtocart {
	WebDriver driver;
	@Before
	public void initlogin() {
		String chromepath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium_training\\selenium_training_eclipse_workspace_reloaded\\New folder\\jar\\New folder\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		PageFactory.initElements(driver, TMAloginpage.class);
		PageFactory.initElements(driver, TMAsearch.class);
	}
	@Given("Alex has registered into TMA")
	public void alex_has_registered_into_TMA() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAloginpage.username.sendKeys("Lalitha");
		TMAloginpage.password.sendKeys("Password123");
		TMAloginpage.login.click();
	}

	@When("Alex searches a particular product like headphones")
	public void alex_searches_a_particular_product_like_headphones() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		TMAsearch.searchbox.sendKeys("head");
		TMAsearch.finddetailsbutton.click();
	}

	@Then("TMA doesn't display the cart icon")
	public void tma_doesn_t_display_the_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div[contains(text(),'Cart')]")).isDisplayed());
		Assert.
	}

	

}
