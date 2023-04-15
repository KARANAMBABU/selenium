package com.seshu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chromedriver.driver",
				"‪D:\\jarfiles\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions actions = new Actions(driver);
		driver.switchTo().frame(0);
		WebElement a = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		actions.dragAndDropBy(a, 5000, 0).perform();
		Thread.sleep(5000);
	    actions.dragAndDropBy(a, -500, 0).perform();
		Thread.sleep(5000);

	}

}
