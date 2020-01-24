package commands.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotdemo {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://topdf.com/");
		driver.manage().window().maximize();
		Robot robot=new Robot();
		robot.setAutoDelay(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Upload Files')]")).click();
		StringSelection stringselect=new StringSelection("C:\\Users\\IBM\\Pictures\\darling.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect,null);
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
