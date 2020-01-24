package commands.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		//System.setProperty("webdriver.gecko.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\geckodriver.exe");
		//WebDriver driver=new FireFoxDriver();
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("chandana.09@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("chandana");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		String expectedname="Demo Web Shop. Login";
		String actualname=driver.getTitle();
		System.out.println(actualname);
		if(expectedname.equals(actualname))
		{
			System.out.println("U are on the correct page");
		}
		else{
			System.out.println("Incorrect page");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		System.out.println(pagesource.length());
		System.out.println(actualname.length());
	    driver.close();
	
	}
	
}

