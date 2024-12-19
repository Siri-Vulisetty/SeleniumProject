package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingTextBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://testkru.com/Elements/TextFields");
		
		WebElement txtbox=driver.findElement(By.id("firstName"));
		
		txtbox.sendKeys("Test");
		
		WebElement txtbox2=driver.findElement(By.id("lastNameWithPlaceholder"));
		
		//disabledField
		String name=txtbox2.getAttribute("placeholder");
		
		
		System.out.println(name);
		
		System.out.println(txtbox.isDisplayed());
		
		System.out.println(txtbox.isEnabled());
		
		WebElement txtbox3=driver.findElement(By.id("invisibleField"));
		
		System.out.println(txtbox3.isDisplayed());
		
		WebElement txtbox4=driver.findElement(By.id("disabledField"));
		
		System.out.println(txtbox4.isEnabled());
		
		
		
		
	}

}
