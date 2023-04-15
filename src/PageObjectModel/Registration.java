package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
	WebDriver driver;

	By user = By.xpath("//*[@id=\"txtuId\"]");
	By pass = By.xpath("//*[@id=\"txtPword\"]");
	By ok = By.xpath("//*[@id=\"login\"]");

	Registration(WebDriver c) {
		driver = c;
	}

	public void log(String str) {

		driver.findElement(user).sendKeys(str);
	}

	public void log1(String str1) {

		driver.findElement(pass).sendKeys(str1);
	}
	public void log2() {

		driver.findElement(ok).click();
	}

}
