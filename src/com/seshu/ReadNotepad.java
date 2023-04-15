package com.seshu;

import java.io.BufferedReader;
import java.io.FileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadNotepad {

	public static void main(String[] args) throws Throwable {

		FileReader f = new FileReader("D:\\temp.txt");
		BufferedReader br = new BufferedReader(f);
		String str = "";
		WebDriver driver = new ChromeDriver();
		while ((str = br.readLine()) != null) {
			String login[] = str.split(";");
			driver.get("http://primusbank.qedgetech.com/");
			driver.findElement(By.id("txtuId")).sendKeys(login[0]);
			driver.findElement(By.id("txtPword")).sendKeys(login[1]);
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		}
		driver.close();

	}

}
