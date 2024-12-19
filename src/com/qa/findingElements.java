package com.qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com");
		
		//WebElement link=driver.findElement(By.linkText("Gma"));
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		for(WebElement w : allLinks) {
			
			System.out.println(w.getAttribute("aria-label"));
		}
		
		
		
		

	}

}
