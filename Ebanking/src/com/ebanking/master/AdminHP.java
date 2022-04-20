package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHP 
{

	//Element Properties
	
	@FindBy(xpath="//img[@src='images/Branches_but.jpg']")
	WebElement Branch;
	

	@FindBy(xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	WebElement Role;
	

	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")
	WebElement Employee;
	

	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")
	WebElement LogOut;
	
	//Element Methods
	
	public void Br() 
	{
	Branch.click();	
	}
	
	public void Rol() 
	{
	Role.click();	
	}
}
