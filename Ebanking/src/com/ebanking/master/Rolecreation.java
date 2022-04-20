package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Rolecreation 
{

	@FindBy(id="txtRname")
	WebElement Rname;
	

	@FindBy(id="lstRtypeN")
	WebElement Rtype;
	

	@FindBy(id="btninsert")
	WebElement Rsub;
	
	public void Rcre(String Rn,String Rty) throws InterruptedException 
	{
		Rname.sendKeys(Rn);
		Select Rt=new Select(Rtype);
		Rt.selectByVisibleText(Rty);
		Thread.sleep(3000);
		Rsub.click();
	}
}
