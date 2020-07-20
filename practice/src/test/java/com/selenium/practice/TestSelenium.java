package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium {

	@Test
	public void testing() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/suryateja/Desktop/Eclipse/practice/chromedriver");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		driver.quit();
	}	
	
	
	public static void main(String[] args) throws InterruptedException {
		TestSelenium t = new TestSelenium();
		t.testing();
		
	}
}
