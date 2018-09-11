package bhaskar1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		//Thread.sleep(20000);
		Select sel=new Select(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")));
	    sel.selectByIndex(10);
	    Thread.sleep(2000);
	    sel.selectByValue("234");
	    Thread.sleep(2000);
	    sel.selectByVisibleText("INDIA");
	    Thread.sleep(2000);
	    System.out.println("multipuliteames selection"+sel.isMultiple());
	    Thread.sleep(2000);
	    System.out.println("selection iteam is "+sel.getFirstSelectedOption().getText());
		driver.findElement(By.name("email")).sendKeys("bhaskar");
	    driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys("1234@");
		driver.findElement(By.name("confirmPassword")).sendKeys("1234@");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
		
		

	}

}
