package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
public class webdriver_demo1 {
WebDriver driver=null;
WebDriver driverie=null;
WebDriver driverfx=null;
  @Test
  public void f() {
	  String url="http://www.google.com";
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\chromedriver.exe\\");
	  driver=new ChromeDriver();
	  driver.get(url);
	  System.out.println("the title is "+driver.getTitle());
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\IEDriverServer.exe\\");
	  driverie=new InternetExplorerDriver();
	  driverie.get(url);
	  System.out.println("the title is "+driverie.getTitle());
	  /*driver.manage().window().maximize();
	  driver.manage().window().maximize();*/
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\geckodriver.exe\\");
	  driverfx=new FirefoxDriver();
	  driverfx.get(url);
  }
}
