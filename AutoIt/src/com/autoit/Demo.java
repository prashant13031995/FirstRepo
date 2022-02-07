package com.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/playground/");
		driver.findElement(By.linkText("File Upload")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("file")).click();
		Thread.sleep(3000);
		//Runtime.getRuntime().exec("E:\\AutoIt\\3rdSep.exe");
	}

}
