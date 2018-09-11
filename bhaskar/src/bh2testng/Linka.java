package bh2testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Linka {
public WebDriver driver;
	
	@BeforeMethod
	public void LaunchApp()
	{
		//Launch application
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
	}
	
	@AfterMethod
	public void CloseApp()
	{
		//Close my application
		driver.quit();
	}
@Test(priority=4,groups={"smoke","regression"})
public void bustickets()
{
//checking bustickets
boolean status=driver.findElement(By.xpath("//*[@id=\"page_main_header\"]/nav/ul/li[1]/a")).isDisplayed();
Assert.assertEquals(true, status);
}
	
@Test(priority=1,groups={"sanity","regression"})
public void hotels()
{
//checking hotels
boolean status=driver.findElement(By.xpath("//*[@id=\"page_main_header\"]/nav/ul/li[2]/a")).isDisplayed();
Assert.assertEquals(true, status);
}

@Test(priority=3,groups={"sanity","regression","smoke"})
public void bushire()
{
//checking bustickets
boolean status=driver.findElement(By.xpath("//*[@id=\"page_main_header\"]/nav/ul/li[3]/a")).isDisplayed();
Assert.assertEquals(true, status);
}

@Test(priority=2,groups={"sanity","smoke"})
public void pilgrimage()
{
//checking bustickets
boolean status=driver.findElement(By.xpath("//*[@id=\"page_main_header\"]/nav/ul/li[4]/a")).isDisplayed();
Assert.assertEquals(true, status);
}

}
