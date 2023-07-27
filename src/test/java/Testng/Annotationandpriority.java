package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Annotationandpriority {
	WebDriver driver;
	
	@Test(priority=1)
	void OpenApp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4");
		
		
	}
	@Test(priority=2)
	void Login()
	{
		driver.findElement(By.name("uid")).sendKeys("mngr511829");
		driver.findElement(By.name("password")).sendKeys("EbUvaze");
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().alert().accept();
	}
	@Test
	void search()
	{
		System.out.println("Search");
	}
	@Test(priority=3)
	void CloseApp()
	{
		driver.close();
	}
	

}
