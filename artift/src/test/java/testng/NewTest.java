package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
public class NewTest {
	WebDriver driver;

	@BeforeClass
	void Tester1() {
		System.out.println("Start All Test Cases As Automation Script By Mr_Rajesh");
	}

	@BeforeMethod
	void Login() throws InterruptedException {
		WebDriver driver= (WebDriver) chromedriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://adactinhotelapp.com");
		driver.findElement(By.name("username")).sendKeys("shubham1911");
		Thread.sleep(500);
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(500);
		driver.findElement(By.name("login")).click();
	}

	private Object chromedriver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	void TestCase1() throws InterruptedException {
		WebElement a1 = driver.findElement(By.name("location"));
		Select A1 = new Select(a1);
		A1.selectByValue("Paris");
		Thread.sleep(500);

		WebElement a2 = driver.findElement(By.name("hotels"));
		Select A2 = new Select(a2);
		A2.selectByValue("Hotel Sunshine");
		Thread.sleep(500);

		WebElement a3 = driver.findElement(By.name("room_type"));
		Select A3 = new Select(a3);
		A3.selectByValue("Double");
		Thread.sleep(500);

		WebElement a4 = driver.findElement(By.name("room_nos"));
		Select A4 = new Select(a4);
		A4.selectByValue("2");
		Thread.sleep(500);

		driver.findElement(By.name("datepick_in")).clear();
		driver.findElement(By.name("datepick_in")).sendKeys("19/11/2022");
		driver.findElement(By.name("datepick_out")).clear();
		driver.findElement(By.name("datepick_out")).sendKeys("20/11/2022");

		WebElement a5 = driver.findElement(By.name("adult_room"));
		Select A5 = new Select(a5);
		A5.selectByValue("2");
		Thread.sleep(500);

		WebElement a6 = driver.findElement(By.name("child_room"));
		Select A6 = new Select(a6);
		A6.selectByValue("2");
		Thread.sleep(500);

		driver.findElement(By.name("Submit")).click();

		String expResult = "Select Hotel";
		String actResult = driver.findElement(By.xpath("//*[@id=\"select_form\"]/table/tbody/tr[1]/td")).getText();
		Assert.assertEquals(expResult, actResult);
		System.out.println("Test Case 1st Is Pass");
	}

	@Test
	void TestCase2() throws InterruptedException {
		WebElement a1 = driver.findElement(By.name("location"));
		Select A1 = new Select(a1);
		A1.selectByValue("Paris");
		Thread.sleep(500);
		driver.findElement(By.id("Submit")).click();

		driver.findElement(By.id("radiobutton_1")).click();
		Thread.sleep(500);
		driver.findElement(By.name("continue")).click();

		String expResult = "Book A Hotel";
		String actResult = driver.findElement(By.xpath("//*[@id=\"book_hotel_form\"]/table/tbody/tr[2]/td")).getText();
		Assert.assertEquals(expResult, actResult);
		System.out.println("Test Case 2nd Is Pass");
	}

	@Test
	void TestCase3() throws InterruptedException {
		WebElement a1 = driver.findElement(By.name("location"));
		Select A1 = new Select(a1);
		A1.selectByValue("Paris");
		Thread.sleep(500);
		driver.findElement(By.id("Submit")).click();

		driver.findElement(By.id("radiobutton_2")).click();
		Thread.sleep(500);
		driver.findElement(By.name("continue")).click();
		Thread.sleep(500);
		driver.findElement(By.name("first_name")).sendKeys("Shubham");
		Thread.sleep(500);

		driver.findElement(By.name("last_name")).sendKeys("Patil");
		Thread.sleep(500);

		driver.findElement(By.name("address")).sendKeys("Ameerpeth Hyderabad-500016");
		Thread.sleep(500);

		driver.findElement(By.name("cc_num")).sendKeys("1234567891234567");
		Thread.sleep(500);

		WebElement a7 = driver.findElement(By.name("cc_type"));
		Select A7 = new Select(a7);
		A7.selectByValue("MAST");
		Thread.sleep(500);

		WebElement a8 = driver.findElement(By.name("cc_exp_month"));
		Select A8 = new Select(a8);
		A8.selectByValue("11");
		Thread.sleep(500);

		WebElement a9 = driver.findElement(By.name("cc_exp_year"));
		Select A9 = new Select(a9);
		A9.selectByValue("2022");
		Thread.sleep(500);

		driver.findElement(By.name("cc_cvv")).sendKeys("7542");
		Thread.sleep(500);

		driver.findElement(By.name("book_now")).click();

		String expResult = "Booking Confirmation";
		String actResult = driver.findElement(By.xpath("//*[@id=\"booking_form\"]/table/tbody/tr[1]/td")).getText();
		Assert.assertEquals(expResult, actResult);
		System.out.println("Test Case 3rd Is Pass");

	}

	@Test
	void TestCase4() {
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
		String expResult = "You have successfully logged out. Click here to login again";
		String actResult = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td"))
				.getText();
		Assert.assertEquals(expResult, actResult);
		System.out.println("Test Case 4th Is Pass");
	}

	@AfterMethod
	void Clouser() {
		driver.close();
		System.out.println("The Program Is Successfully Done");
	}

	@AfterClass
	void Tester2() {
		System.out.println("------------------------------------------------");
		System.out.println("All Test Cases Is Successfully Run By Mr_Shubham");
	}
}

