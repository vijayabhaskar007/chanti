package bhaskar1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinksdisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement>allinks=driver.findElements(By.tagName("a"));
		System.out.println("display all links"+allinks.size());
		for(int i=0;i<allinks.size();i++)
		{
			System.out.println("display the links"+allinks.get(i).getText());
		}
        for(int i=0;i<10;i++)
        {
        	System.out.println("display the links"+allinks.get(i).getText());
        }
	}

}
