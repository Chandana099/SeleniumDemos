package commands.demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		Set<String> s1=driver.getWindowHandles();		
        Iterator<String> iter=s1.iterator();	
        String mainWindow=iter.next();
        String childWindow=iter.next();
        driver.switchTo().window(childWindow);
        System.out.println("The title of child window is:"+driver.getTitle());
        driver.close();
        driver.switchTo().window(mainWindow);	
        System.out.println("The title of main window is:"+driver.getTitle());
        driver.close();
	}
}		
	


