package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Roleng extends Base
{
    @Test(dataProvider="Rdata")
	public void rol(String Rn,String Rt) throws InterruptedException 
	{
		LB.Role(Rn,Rt);
	}
    
    @DataProvider
    
    public Object[][] Rdata()
    {
    	Object[][] Obj=new Object[3][2];
    	
    	Obj[0][0]="SbicashierBk";
    	Obj[0][1]="E";
    	
    	Obj[1][0]="icicicashierBk";
    	Obj[1][1]="E";
    	
    	Obj[2][0]="TellerHdfc";
    	Obj[2][1]="E";
    	
    	return Obj;
    	
    }
    
    
}
