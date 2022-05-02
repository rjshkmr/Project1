package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@Test
		public void a() {
			System.out.println("Test Case 1");
		}

		@Test
		public void b() {
			System.out.println("Test Case 2");
		}

		@Test
		public void c() {
			System.out.println("Test Case 3");
		}
		
		@Test
		public void d() {
			System.out.println("Test Case 4");
		}
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("Before Method Executed");
		}

		@AfterMethod
		public void afterMethod() {
			System.out.println("After Method Executed");
		}

		@BeforeClass
		public void beforeClass() {
			System.out.println("Before Class Executed");
		}

		@AfterClass
		public void afterClass() {
			System.out.println("After Class Executed");
		}

		@BeforeTest
		public void beforeTest() {
			System.out.println("Before Test Executed");
		}

		@AfterTest
		public void afterTest() {
			System.out.println("After Test Executed");
		}

		@BeforeSuite
		public void beforeSuite() {
			System.out.println("Before Suite Executed");
		}

		@AfterSuite
		public void afterSuite() {
			System.out.println("After Suite Executed");
		
	}

}
