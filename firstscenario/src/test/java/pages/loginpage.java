package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpage {
	@FindBy(how=How.ID,using="Email")
	public static WebElement demowebshopemail;
	@FindBy(how=How.ID,using="Password")
	public static WebElement demowebshopPassword;
	@FindBy(how=How.CSS,using="input[value='Log in']")
	public static WebElement demowebshoplogin;
	@FindBy(how=How.LINK_TEXT,using="Log out")
	public static WebElement demowebshoplogout;

	
}