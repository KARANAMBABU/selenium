package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration1 {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"txtuId\"]")
	WebElement user;
	@FindBy(xpath = "//*[@id=\"txtPword\"]")
	WebElement pass;
	@FindBy(xpath = "//*[@id=\"login\"]")
	WebElement ok;

	Registration1(WebDriver d) {
		driver = d;

		PageFactory.initElements(d, this);
	}

	public void setUser(String str) {
		user.sendKeys(str);
	}

	public void sepass(String str1) {
		pass.sendKeys(str1);
	}

	public void enter() {
		ok.click();

	}

}
