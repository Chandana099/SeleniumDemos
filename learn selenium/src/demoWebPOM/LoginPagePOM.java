package demoWebPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
	WebDriver driver;
	By Email=By.id("Email");
	By Password=By.name("Password");
	By login=By.xpath("//input[@class='button-1 login-button']");
	
	public LoginPagePOM(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterEmail(String EM)
	{
		driver.findElement(Email).sendKeys(EM);
	}
	public void enterpassword(String PWD)
	{
		driver.findElement(Password).sendKeys(PWD);
	}
	public void clicklogin()
	{
		driver.findElement(login).click();
	}

}
