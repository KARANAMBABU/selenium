package com.reading.properites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDatafromProperties {

	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		FileInputStream fi = new FileInputStream("D:/selenium/pro.properties");
		pro.load(fi);
		WebDriver driver = new ChromeDriver();
		driver.get(pro.getProperty("url"));
		driver.findElement(By.xpath(pro.getProperty("user"))).sendKeys("Admin");
		driver.findElement(By.xpath(pro.getProperty("pass"))).sendKeys("Admin");
		driver.findElement(By.xpath(pro.getProperty("button"))).click();
		driver.close();

	}

}
