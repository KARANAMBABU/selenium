package com.seshu;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("driver.chromedriver.driver",
				"‪D:\\jarfiles\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement each : links) {
			String seshu = each.getAttribute("href");
			System.out.println(seshu);
			URL url = new URL(seshu);
			HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
			httpcon.connect();
			int res = httpcon.getResponseCode();
			if(res>=400) {
			System.out.println("url is not broken link" +url);
		}
			else {
				System.out.println("url is broken link" +url);

			}

		}
	}
}



