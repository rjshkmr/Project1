package artift;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\S\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://aitsteam.com/Diploma/ViewReport/");
		  driver.findElement(By.name("RegNumber")).sendKeys("AITS/A/1236/19");
		  driver.findElement(By.name("StudName")).sendKeys("NAINIKA RAJ");
		  driver.findElement(By.name("submit")).click();
		  System.out.println(driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr[3]/td[2]/strong")).getText());

		  driver.close();
		  
		  
	}

}
