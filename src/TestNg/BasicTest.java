package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BasicTest {
	@Test(groups = "automation", description = "Testing f", priority = 0, enabled = true)
	public void f() {
		Reporter.log("Hai", true);
	}

	@Test(dependsOnMethods = "f", description = "Testing f1", enabled = true)
	public void f1() {
		Reporter.log("Hello", true);
	}

	@Test(dependsOnMethods = "f2", description = "Testing f2", enabled = true)
	public void f2() {
		Reporter.log("welcome", true);
	}

	@Test(dependsOnGroups = "f2", description = "Testing f2", priority = 1, enabled = true)
	public void f3() {
		Reporter.log("welcome", true);
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
