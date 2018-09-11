package bhaskar1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		System.out.println("youtube titile is"+driver.getTitle());
		//System.err.println("element existed"+driver.findElement(By.name=("search_query")).isDisplayed());
		driver.findElement(By.xpath("//*[@id='search']")).sendKeys("tv9");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='channel-title']/span")).click();
		driver.quit();

	}

}
