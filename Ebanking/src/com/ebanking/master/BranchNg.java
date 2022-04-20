package com.ebanking.master;

import org.testng.annotations.Test;

public class BranchNg extends Base
{
     @Test
	public void branch() throws InterruptedException 
	{
		LB.Branches("Mqsyshyd","Kphb","45689","INDIA","GOA","GOA");
	}
}
