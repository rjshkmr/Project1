package artift;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WikipediaEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\S\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        String expectedResult="India";
	        driver.get("https://en.wikipedia.org/wiki/Main_Page");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        driver.findElement(By.name("search")).sendKeys("India");
	        driver.findElement(By.name("go")).click();
	        
	        
			String actualResult=driver.findElement(By.xpath("/html/body/div[3]/h1")).getText();

			Assert.assertEquals(actualResult, expectedResult);
	        
			driver.close();
	        
	        
	        



	}

}
