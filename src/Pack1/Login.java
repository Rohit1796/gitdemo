package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends POMLoginpage
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	@FindBy(xpath="//input[@id='login-button']")
	WebElement login;
	 
}
