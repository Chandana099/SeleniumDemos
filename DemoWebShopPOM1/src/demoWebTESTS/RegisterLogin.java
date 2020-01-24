package demoWebTESTS;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import demoWebPOM.LoginPOM;
import demoWebPOM.RegisterPOM;

	

	public class RegisterLogin{

		WebDriver driver;
		@BeforeMethod
		public void startapp() {
			System.setProperty("webdriver.chrome.driver", "E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
		}

		@Test
		public void checkregister() {

			RegisterPOM register = new RegisterPOM(driver);
			
			driver.findElement(By.xpath("//a[@class='ico-register']")).click();
			register.enterfirstname("Manohar");
			register.enterlastname("Vanam");
			register.enteremail("vanammanohar21@gmail.com");
			register.enterpassword("Manu@1996");
			register.entercpassword("Manu@1996");
			register.clickregister();
			//register.clicksignout();
		}
		
		@Test(priority = 1)
		public void checklogin() {
					
			LoginPOM login = new LoginPOM(driver);
			login.loginlink();
			login.enterEmail("vanammanohar21@gmail.com");
			login.enterpassword("Manu@1996");
			login.clicklogin();
			//login.clicksignout();
		}
		
		@AfterMethod
		public void closebrowser() {
			driver.close();
		}
	}



