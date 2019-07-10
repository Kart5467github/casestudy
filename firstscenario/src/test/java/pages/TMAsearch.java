package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TMAsearch {
	@FindBy(how=How.ID,using="myInput")
	public static WebElement searchbox;
	@FindBy(how=How.CSS,using="input[value='FIND DETAILS']")
	public static WebElement finddetailsbutton;
	@FindBy(how=How.XPATH,using="/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")
	public static WebElement addtocart;
	@FindBy(how=How.CSS,using="a[href='displayCart.htm'")
	public static WebElement cartbutton;
	@FindBy(how=How.CSS,using="a[href='checkout.htm'")
	public static WebElement checkout;
	@FindBy(how=How.CSS,using="input[value='Proceed to Pay'")
	public static WebElement ProceedtoPay;
	@FindBy(how=How.CSS,using="input[style='border:2px solid gray;width:400px;color:black'][name='username']")
	public static WebElement bankusername;
	@FindBy(how=How.CSS,using="input[style='border:2px solid gray;width:400px;color:black'][name='password']")
	public static WebElement bankpassword;
	@FindBy(how=How.CSS,using="input[style='display: flex; justify-content: center;'][value='LOGIN']")
	public static WebElement bankloginbutton;
	@FindBy(how=How.CSS,using="input[style='border:2px solid gray;width:280px;color:black'][value='PASSWORD']")
	public static WebElement Transpassword;
	@FindBy(how=How.XPATH,using="//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")
	public static WebElement Paynow;
	
	
}
