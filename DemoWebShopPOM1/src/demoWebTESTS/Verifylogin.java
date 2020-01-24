package demoWebTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import demoWebPOM.LoginPOM;

public class Verifylogin {
@Test
	public void checklogin()
	{
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		
		LoginPOM login1=new LoginPOM(driver);
		login1.enterEmail("vanammanohar2@gmail.com");
        login1.enterpassword("Manu@1996");
        login1.clicklogin();
       //  login1.actualresult("Login Succesful");
        String expectedresult="vanammanohar2@gmail.com";
        String actualresult=driver.findElement(By.xpath("//a[contains(text(),'vanammanohar2@gmail.com')]")).getText();
        Assert.assertEquals(actualresult,expectedresult);
		driver.close();
        
        driver.close();
	
}
}

