package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Priorities {
	WebDriver driver;
@Test(priority=0)

void login() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\S\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().window().maximize();
    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
    driver.findElement(By.name("Submit")).click();
    Thread.sleep(1000);
}
@Test(priority=1)

void ApplyLeave() throws InterruptedException
{
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[1]/div/a/img")).click();
	driver.findElement(By.name("assignleave[txtEmployee][empName]")).sendKeys("Odis Adalwin");
	 WebElement element= driver.findElement(By.name("assignleave[txtLeaveType]"));
     Select sel=new Select(element);
     sel.selectByIndex(4);
     driver.findElement(By.name("assignleave[txtFromDate]")).clear();
     driver.findElement(By.name("assignleave[txtFromDate]")).sendKeys("2022-04-01");
     driver.findElement(By.name("assignleave[txtToDate]")).clear();
     driver.findElement(By.name("assignleave[txtToDate]")).sendKeys("2022-04-15");
     WebElement element1= driver.findElement(By.name("assignleave[partialDays]"));
     Select sel1=new Select(element);
     sel1.selectByIndex(2);
     driver.findElement(By.name("assignleave[txtComment]")).sendKeys("i want to go home.");
     driver.findElement(By.id("assignBtn")).click();
     
     


	
}


}
