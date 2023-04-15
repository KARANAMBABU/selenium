package com.seshu;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("driver.chromedriver.driver",
				"‪D:\\jarfiles\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		String str = "Primus BANK";
		String str1 = driver.getTitle();
		String pagesource = driver.getPageSource();
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println(windows);
		// System.out.println(pagesource);
		if (str.contains(str1)) {
			System.out.println("login Sucessfully");

		} else {
			System.out.println("login failed");

		}

	}

}
