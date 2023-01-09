package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class launch {
	WebDriver driver;
	public launch(WebDriver driver) {
		this.driver=driver;
	}
	public void launchdriver() {
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Redmi 10");
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	}
	
	
	 public void verifyDocumentation() {
		  String expectedTitle ="Redmi 10" ;

	      String pageTitle =driver.findElement(By.xpath("//h1[@class='title-title']")).getText();
	      Assert.assertEquals(expectedTitle ,pageTitle);
	  }
}
	
