package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/text-box");
		
		WebElement wb=driver.findElement(By.cssSelector("input#userName"));
		
		wb.sendKeys("text");
		
		WebElement wb2=driver.findElement(By.cssSelector("textarea.form-control[placeholder='Current Address']"));

		wb2.sendKeys("Hyderbad");
	}

}
