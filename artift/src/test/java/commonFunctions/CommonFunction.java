package commonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunction{	
	public void hrmLogin() throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\S\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.manage().window().maximize();
	        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.name("Submit")).click();
	        Thread.sleep(3000);
	}
	
	public void hrmLogout()
	{
		//code
	}
	
	public void takeScreenshot()
	{
		//code
	}
	
	public void type(WebElement element, String testData)
	{
		element.sendKeys(testData);
	}

}
