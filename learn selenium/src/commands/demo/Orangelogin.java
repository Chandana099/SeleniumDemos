package commands.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Synchronization
public class Orangelogin {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String Expectedtitle="OrangeHRM";
		System.out.println(Expectedtitle);
		String Actualtitle=driver.getTitle();
		System.out.println(Actualtitle);
		if(Expectedtitle.equals(Actualtitle))
		{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		//Thread.sleep(3000);
		
		WebDriverWait Mywait=new WebDriverWait(driver,10);
		Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='welcome']")));
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		System.out.println("end");
		}
		else
		{
			System.out.println("titles are different");
		}
	}
}
