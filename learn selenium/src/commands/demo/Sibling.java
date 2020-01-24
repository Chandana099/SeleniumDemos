package commands.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[contains(text(),'WebTable')]//parent::li//preceding-sibling::li[1]//child::a[contains(text(),'Register')]")).click();
		driver.findElement(By.xpath("a[contains(text),'WebTable')]//parent::li//parent::ul//child::li//a[contains(text(),'Electronics')]")).click();
		driver.findElement(By.xpath("a[contains(text),'WebTable')]//ancestor::li//parent::ul//child::li//a[contains(text(),'Electronics')]")).click();
		//driver.findElement(By.xpath("*[@class='nav' navbar-nav']//descendent::a))
	}

}
