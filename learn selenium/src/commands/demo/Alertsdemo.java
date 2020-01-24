package commands.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsdemo {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert1=driver.switchTo().alert();
		String alerttitle=driver.switchTo().alert().getText();
		System.out.println("Alerttitle is:"+alerttitle);
		Thread.sleep(3000);
		alert1.accept();

		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert2=driver.switchTo().alert();
		String alerttitle1=driver.switchTo().alert().getText();
		System.out.println("Alert title1:"+alerttitle1);
		Thread.sleep(3000);
		alert2.dismiss();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("chandu");
		String alerttitle2=driver.switchTo().alert().getText();
		System.out.println("Alert title:"+alerttitle2);
		Thread.sleep(3000);
		//alert3.dismiss();
		alert3.accept();
		driver.close();
	}

}
