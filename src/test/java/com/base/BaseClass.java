package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void fill(WebElement e, String data) {
		e.sendKeys(data);

	}

	public static void btnClick(WebElement e) {
		e.click();
	}

	public static void dropDown(WebElement e, String data) {
		Select drops = new Select(e);
		drops.selectByVisibleText(data);
	}

}
