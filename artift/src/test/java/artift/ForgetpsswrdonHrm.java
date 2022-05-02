package artift;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ForgetpsswrdonHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\S\\chromedriver_win32\\chromedriver.exe");
        String expectedResult="Forgot your password?";
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/div/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/form/fieldset/div/input[2]")).click();
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/div/a")).getText());       
        
		String actualResult=driver.findElement(By.linkText("Forgot your password?")).getText();

		Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(100);
		driver.close();
        
	}

}
 