package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoleDetails 
{

	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement Rhome;
	

	@FindBy(id="btnRoles")
	WebElement Newrole;
	
	public void Hom() 
	{
	Rhome.click();	
	}
	
	public void Nrole() 
	{
	Newrole.click();	
	}
}
