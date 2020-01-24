package commands.demo;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxlogin1
{
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.geck.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.get("http://demowebshop.tricentis.com/login");
		System.setProperty("webdriver.gecko.driver","E:\\software required for testing batch\\Testing Softwares\\Selenium Updated Jar\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/login");
	}
	
}



