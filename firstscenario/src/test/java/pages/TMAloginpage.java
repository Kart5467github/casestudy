package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TMAloginpage {
	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	@FindBy(how=How.CSS,using="input[value='Login'")
	public static WebElement login;
	@FindBy(how=How.XPATH,using="//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")
	public static WebElement signout;
}
