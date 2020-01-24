package commands.demo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jdemo {
	public static void main(String[] args)
	{
		Logger log=Logger.getLogger(Log4jdemo.class);
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		log.info("Application started successfully");
		String expectedtitle="google";
		String actualtitle=driver.getTitle();
		log.warn("check title");
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Correct title");
			log.info("Correct page");
			driver.close();
			
		}
		else
		{
			System.out.println("Incorrect title");
			log.error("Incorrect page");
			driver.close();
		}
	}

}
