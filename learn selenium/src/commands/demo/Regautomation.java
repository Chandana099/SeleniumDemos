package commands.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Regautomation {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("chandana");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("chandu");
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Banglore");
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("chandana.09@gmail.com");
		
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//input[@name='radiooptions' and@value='FeMale']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkbox1' and @value='Cricket']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkbox2' and @value='Movies']")).click();
		
		WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select sell2=new Select(year);
		sell2.selectByVisibleText("2012");
		//System.out.println("Number of years:"+year.getSize());
		//System.out.println("years:"+year.getText());
		
		WebElement Month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sell3=new Select(Month);
		sell3.selectByVisibleText("December");
		
		WebElement Day=driver.findElement(By.xpath("//select[@id='daybox']"));
		Select sell4=new Select(Day);
		sell4.selectByVisibleText("9");
		
		WebElement Skills=driver.findElement(By.xpath("//select[@id='Skills']"));
		Select skill1=new Select(Skills);
		skill1.selectByVisibleText("Certifications");
		
		WebElement Country=driver.findElement(By.xpath("//select[@id='Skills']"));
		Select con1=new Select(Country);
		con1.selectByVisibleText("Certifications");
		List<WebElement>linklist=sell2.getOptions();
		System.out.println("Number of links: "+linklist.size());
		for(int i=0;i<linklist.size();i++)
			System.out.println("Link names are:"+linklist.get(i).getText());
		driver.close();
	}

}
