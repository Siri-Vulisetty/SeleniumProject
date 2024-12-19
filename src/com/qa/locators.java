package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com/");
		
		//WebElement tb=driver.findElement(By.id("userName"));
		
		//WebElement textbox=driver.findElement(By.className("gLFyf"));
		
		//WebElement textbox=driver.findElement(By.name("q"));
			
		//textbox.sendKeys("test");
	
		//WebElement link=driver.findElement(By.linkText("Gmail"));
		
		WebElement link=driver.findElement(By.partialLinkText("Gma"));
		
		link.click();
		
		
	}

}
