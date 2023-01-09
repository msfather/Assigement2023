package com.app.tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class added {
	WebDriver driver;
	public added(WebDriver driver) {
		this.driver=driver;
	}
	public void login() throws InterruptedException {
		driver.get("https://www.myntra.com/login/password");
		driver.findElement(By.id("mobileNumberPass")).sendKeys("7037604840");
		driver.findElement(By.xpath("//input[@class='form-control has-feedback']")).sendKeys("Sahil@123");
		driver.findElement(By.xpath("//button[@class='btn primary  lg block submitButton']")).click();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
		driver.findElement(By.xpath("//*[@class='logo-inline']")).click();
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Redmi 10");
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		driver.findElement(By.xpath("//div[@class='product-productMetaInfo']")).click();
		Set<String> h=driver.getWindowHandles();
        for(String string : h) {
            driver.switchTo().window(string);
        }
        driver.findElement(By.xpath("//*[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@data-reactid,'905')]")).click();
		
		String actualbag=driver.findElement(By.xpath("//*[@class='bulkActionStrip-message']")).getText();
        String expectedbagItem ="1/1 ITEMS SELECTED";
        System.out.println(actualbag);
        Assert.assertEquals(actualbag, expectedbagItem);
	}
}
