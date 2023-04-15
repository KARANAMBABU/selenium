package com.seshu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chromedriver.driver",
				"‪D:\\jarfiles\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		String seshu = driver.switchTo().alert().getText();
		System.out.println(seshu);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"txtuId\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPword\"]")).sendKeys("Admin");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		// select branches
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		// deleting data in branches
		driver.findElement(By.xpath("//*[@id=\"DG_bankdetails\"]/tbody/tr[2]/td[8]/a/img")).click();
		Thread.sleep(500);
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().dismiss();

	}

}
