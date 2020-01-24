package commands.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksdemo {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		List<WebElement>linklist=driver.findElements(By.tagName("a"));
		System.out.println("Number of links: "+linklist.size());
		for(int i=0;i<linklist.size();i++)
			System.out.println("Link names are:"+linklist.get(i).getText());
		driver.close();
	}

}
