package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistertionTest {
	@Test
	public void seshu() {
		System.setProperty("driver.chromedriver.driver",
				"‪D:\\jarfiles\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Registration1 reg = new Registration1(driver);
		driver.get("http://primusbank.qedgetech.com/");
		reg.setUser("Admin");
		reg.sepass("Admin");
		reg.enter();
	}

}
