package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class firstTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ChromeOptions op=new ChromeOptions();
		
		op.addArguments("--headless=new");
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getClass());
		
		
		
		

	}

}
