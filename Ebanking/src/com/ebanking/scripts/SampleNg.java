package com.ebanking.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleNg 
{
      WebDriver driver;
      
	 @BeforeMethod
	 public void launch()
	 {
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
	 }
	 @Test
	 public void ranfordapp()
	 {
		 driver.get("http://122.175.8.158/ranford2");
	 }
	 @Test
	 public void google() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 driver.get("http://www.google.com");
	 }
	 @AfterMethod
	 public void Aclose() throws InterruptedException 
	 {
		 Thread.sleep(3000);
		 driver.close();
	 }
}
