package com.seshu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("driver.chromedriver.driver",
				"‪D:\\jarfiles\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions ac = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		WebElement tar = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		ac.clickAndHold().dragAndDrop(src, tar).perform();
		

	}

}
