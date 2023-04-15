package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest2 {

	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("driver.chromedriver.driver",
				"‪D:\\jarfiles\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		Reporter.log("Open URL", true);
		Thread.sleep(5000);
	}

	@Test
	public void start() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"txtuId\"]")).sendKeys("Admin");
		Reporter.log("enter user name", true);
		driver.findElement(By.xpath("//*[@id=\"txtPword\"]")).sendKeys("Admin");
		Reporter.log("enter password", true);
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		Reporter.log("Clicked on login button", true);
		Thread.sleep(5000);

	}

	@AfterTest
	public void setuplclose() throws InterruptedException {
		driver.close();
		Reporter.log("closing the browser", true);
		Thread.sleep(300);
	}

}
