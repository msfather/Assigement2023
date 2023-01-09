package com.app.pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import properties.propertyfile;

public class added {
	
	public static String password;
	
	public static String login;

	public static String url;
	WebDriver driver;
	public added(WebDriver driver) {
		this.driver=driver;
	}
	public void login() throws InterruptedException {
		try {
			propertyfile.getpropertyfile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		driver.get(url);
		driver.findElement(By.id("mobileNumberPass")).sendKeys(login);
		driver.findElement(By.xpath("//input[@class='form-control has-feedback']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='btn primary  lg block submitButton']")).click();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
		driver.findElement(By.xpath("//*[@class='logo-inline']")).click();
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Redmi 10");
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		//driver.findElement(By.xpath("//div[@class='product-productMetaInfo']")).click();
		driver.findElement(By.xpath("//*[@class='img-responsive']")).click();
		
		Set<String> h=driver.getWindowHandles();
        for(String string : h) {
            driver.switchTo().window(string);
        }
       
        driver.findElement(By.xpath("//*[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@data-reactid,'905')]")).click();
		
		String actualbagitem=driver.findElement(By.xpath("//*[@class='bulkActionStrip-message']")).getText();
        String expectedbagItem ="1/1 ITEMS SELECTED";
        System.out.println(actualbagitem);
        Assert.assertEquals(actualbagitem, expectedbagItem);
	}
}
