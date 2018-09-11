package bhaskar1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jagantravels.com/");
		driver.findElement(By.xpath("//*[@id=\"close\"]/img")).click();
		driver.manage().window().maximize();
		List<WebElement>radio=driver.findElements(By.name("triptype"));
		System.out.println("disply the radiosize"+radio.size());
		Thread.sleep(2000);
		radio.get(1).click();

	}

}
