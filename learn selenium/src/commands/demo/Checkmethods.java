package commands.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkmethods {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		boolean checkpresence=driver.findElement(By.id("Email")).isDisplayed();
		System.out.println(checkpresence);
		boolean checkenabled=driver.findElement(By.id("Email")).isEnabled();
		System.out.println(checkenabled);
		if(checkpresence==true && checkenabled==true)
			driver.findElement(By.id("Email")).sendKeys("chandana.09@gmail.com");
	}

}
