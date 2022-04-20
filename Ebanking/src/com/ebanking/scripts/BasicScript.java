package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicScript {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String Expval="Ranford Bank";
	   
             //Launch Firefox
		
		WebDriver driver=new FirefoxDriver();
		
		    //Maximise
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("http://122.175.8.158/ranford2");
		
		String Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		//Comparision
		
		if (Expval.equalsIgnoreCase(Actval))
		{
	    	System.out.println("Application Launch Succ");	
		}
		else
		{
			System.out.println("Application is not Launch Succ");
		}
		String Title=driver.getTitle();
		System.out.println(Title);
		
		//System.out.println(driver.getTitle());
		
		//Admin Login
		
		Expval="Welcome to Admin";
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Mq$ystems@");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).click();
		
		Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
		//Comparision
		
		if (Expval.equalsIgnoreCase(Actval))
		{
	    	System.out.println("Admin Login Succ");	
		}
		else
		{
			System.out.println("Admin Login Failed");
		}
		
		Expval="Sucessfully";
		
		driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		
		driver.findElement(By.id("txtbName")).sendKeys("mindqsystestinh");
        driver.findElement(By.id("txtAdd1")).sendKeys("ammerpet");
        driver.findElement(By.id("txtZip")).sendKeys("12345"); 
		
        Thread.sleep(3000);
        
		//DropDown
		
		Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		Ctry.selectByVisibleText("INDIA");
		
		new Select(driver.findElement(By.id("lst_stateI"))).selectByVisibleText("GOA");
		new Select(driver.findElement(By.id("lst_cityI"))).selectByVisibleText("GOA");
		driver.findElement(By.id("btn_insert")).click();
		
		Thread.sleep(3000);
	
		//Alert
		
		Actval=driver.switchTo().alert().getText();
		
		
		//Comparision
		
		if (Actval.contains(Expval))
		{
			System.out.println("Branch Created");
		}
		else
		{
			System.out.println("Branch Already exist");
		}
		
		
		
	}

}
