package commands.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("FirstName")).sendKeys("chandana");
		driver.findElement(By.id("LastName")).sendKeys("Koppuravuri");
		driver.findElement(By.name("Email")).sendKeys("chandana.09@gmail.com");
		//driver.findElement(By.xpath("))
		driver.findElement(By.name("Password")).sendKeys("chandana");
		driver.findElement(By.tagName("Confirm password")).sendKeys("chandana");
	}

}
