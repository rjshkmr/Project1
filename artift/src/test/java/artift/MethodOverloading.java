package artift;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MethodOverloading {
			WebDriver driver;
		
		public static void main(String [] args) throws InterruptedException 
	     {
			MethodOverloading aobj = new MethodOverloading();
			aobj.setUp();
			aobj.search("Odis");
	        aobj.search("Odis", "John Smith");     
	    
	     
			}
		void setUp() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\S\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.name("Submit")).click();
	        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")).click();
	       
		}
		 void search(String employeeName) throws InterruptedException
		 
			{
		        driver.findElement(By.name("empsearch[employee_name][empName]")).click();
		        System.out.println("Inside search");
		        Thread.sleep(1000);
                driver.findElement(By.name("empsearch[employee_name][empName]")).click();
		        driver.findElement(By.name("_search")).click();
		        driver.close();
			}
			
			void search(String employeeName, String superVisorName) throws InterruptedException
			{
			        Thread.sleep(2000);
	     	        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")).click();
			        driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys(employeeName);
			        driver.findElement(By.name("empsearch[supervisor_name]")).sendKeys(superVisorName);
			        driver.findElement(By.name("_search")).click();
			        driver.close();

			}

	       
	}
		       
