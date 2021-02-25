package com.unit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.base.BaseClass;

public class Task1 extends BaseClass {
	
	@BeforeClass
	public static void browserLaunch() {
		
		launchBrowser();
		loadUrl("http://adactinhotelapp.com/index.php");
		
	}
	
	@Before
	public  void startTime()  {
		Date d=new Date();
		System.out.println(d);	
	}
	
	@Test
	public void tc0()  {
		BaseClass b=new BaseClass();
		WebElement userName = driver.findElement(By.id("username"));
		b.fill(userName, "prabhusundaram28");
		WebElement passWord = driver.findElement(By.id("password"));
		b.fill(passWord, "Prabhu@1996");
		WebElement loginButton = driver.findElement(By.id("login"));
		b.btnClick(loginButton);
	}
	@Test
	public void tc1() {
		BaseClass b=new BaseClass();
		WebElement location = driver.findElement(By.id("location"));
		b.dropDown(location, "Sydney");
		WebElement hotels = driver.findElement(By.id("hotels"));
		b.dropDown(hotels, "Hotel Sunshine");
		WebElement roomType = driver.findElement(By.id("room_type"));
		b.dropDown(roomType, "Double");
		WebElement noOfRooms = driver.findElement(By.id("room_nos"));
		b.dropDown(noOfRooms, "1 - One");
		WebElement adultPerRooms = driver.findElement(By.id("adult_room"));
		b.dropDown(adultPerRooms, "2 - Two");
		WebElement childPerROom = driver.findElement(By.id("child_room"));
		b.dropDown(childPerROom, "2 - Two");
	}
	
	@After
	public void endTime() throws InterruptedException {
		Date d=new Date();
		System.out.println(d);
		Thread.sleep(5000);
	}
	@AfterClass
	public static void driverClose() {
		System.out.println("close");
	}
}
