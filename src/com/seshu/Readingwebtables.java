package com.seshu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readingwebtables {

	public static void main(String[] args) {
		System.setProperty("driver.chromedriver.driver",
				"‪D:\\jarfiles\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		int row = driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr")).size();
		System.out.println(row);
		int co = driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr/th")).size();
		System.out.println(co);
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= co; i++) {

				String table = driver
						.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+j+"]/th["+i+"]"))
						.getText();
				System.out.println(table);
			}
			System.out.println();
		}
	}
}
