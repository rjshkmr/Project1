package artift;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "D:\\S\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        String expectedResult="Administration";

	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.name("Submit")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")).click();
	        driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("Odis");
	        driver.findElement(By.name("_search")).click();
	        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr/td[7]")).getText());
			String actualResult=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr/td[7]")).getText();

			Assert.assertEquals(actualResult, expectedResult);
			Thread.sleep(500);
            driver.close();
	    

}
}

