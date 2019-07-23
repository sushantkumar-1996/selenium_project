package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class webdriverdemo2_driverutility {
  @Test
  public void f() {
	  WebDriver driver=DriverUtility.getDriver("chrome");
	  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	  driver.get(url);
	  driver.manage().window().maximize();
	  System.out.println("title of the page"+driver.getTitle());
	  /*Assert.assertEquals("Home",driver.getTitle());
	  Assert.assertTrue("Home".contains("Home"));
	  Assert.assertTrue("Home".startsWith("Ho"));*/
	  
	  //inspect element using locator
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.id("userName")).sendKeys("lalitha");
	  driver.findElement(By.name("password")).sendKeys("password123");
	  driver.findElement(By.name("Login")).click();
	  driver.close();//only this tab closes
	  //driver.quit(); close all tabs
  }
}
