package artift;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ApplyingLeave {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\S\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("http://183.82.103.245/nareshit/login.php");
	        driver.manage().window().maximize();
	        Thread.sleep(50000);
	        driver.findElement(By.name("txtUsername")).sendKeys("nareshit");
	        driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	        driver.findElement(By.name("Submit")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[1]/div/a/img")).click();
            driver.findElement(By.name("assignleave[txtEmployee][empName]")).sendKeys("Orange test");
            WebElement element= driver.findElement(By.name("assignleave[txtLeaveType]"));
            Select sel=new Select(element);
            sel.selectByIndex(4);
            driver.findElement(By.name("assignleave[txtFromDate]")).clear();
            Thread.sleep(1000);
            driver.findElement(By.name("assignleave[txtFromDate]")).sendKeys("2022-04-01");
            Thread.sleep(1000);
            driver.findElement(By.name("assignleave[txtToDate]")).clear(); 
            Thread.sleep(1000);
	        driver.findElement(By.name("assignleave[txtToDate]")).sendKeys("2022-04-15");
	        Thread.sleep(1000);
	        driver.findElement(By.name("assignleave[txtComment]")).sendKeys("i am not feeling well.");
	        Thread.sleep(1000);
	        driver.findElement(By.id("assignBtn")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("confirmOkButton")).click();
	        Thread.sleep(1000);
	        driver.close();
	        


		
	}

}
