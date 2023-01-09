package com.app.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.pages.launch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Apptest {
  WebDriver driver;
  launch ch;
  added add;
  @BeforeMethod
  public void setup() {
		WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      ch=new launch(driver);
      add=new added(driver);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
       driver.get("https://www.myntra.com/");
	}
  @Test
  public void verify() {
     ch.launchdriver();
     ch.verifyDocumentation();
}
 @Test
 public void loginpage() throws InterruptedException {
	 add.login();
 }
  
}
