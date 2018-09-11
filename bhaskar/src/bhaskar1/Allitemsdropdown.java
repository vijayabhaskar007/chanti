package bhaskar1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Allitemsdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(2000);
        System.out.println("my titileis "+driver.getTitle());
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
        //get all the iteames into list
        Select dropdown=new Select(driver.findElement(By.name("country")));
        List<WebElement>drpitems=dropdown.getOptions();
        System.out.println("getall iteam count "+drpitems.size());
        for(int i=0;i<=drpitems.size();i++)
        {
        	System.out.println(drpitems.get(i).getText());
        
        }
        
        
	}

}
