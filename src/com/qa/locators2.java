package com.qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/text-box");
		
		List<WebElement> inputs=driver.findElements(By.tagName("input"));
		
		System.out.println(inputs.size());
		
		for(WebElement w : inputs) {
			
			System.out.println(w.getDomAttribute("placeholder"));
			
			
			
		}
		
		
		
				

	}

}
