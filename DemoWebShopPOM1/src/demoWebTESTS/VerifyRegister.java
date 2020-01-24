package demoWebTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import demoWebPOM.RegisterPOM;

public class VerifyRegister {
	
	@Test
	public void checkRegister()
	{
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		RegisterPOM register=new RegisterPOM(driver);
	//	register.gender("FEMALE");
		register.enterfirstname("chandana");
		register.enterlastname("koppuravuri");
		register.enteremail("chandana22@gmail.com");
		register.enterpassword("chandana");
		register.entercpassword("chandana");
		register.clickregister();
		
		String actualresult="Your registration completed";
		String expectedresult=driver.findElement(By.xpath("//*[contains(text(),'Your registration completed')]")).getText();
		
		Assert.assertEquals(actualresult,expectedresult);
		driver.close();
	}

}
