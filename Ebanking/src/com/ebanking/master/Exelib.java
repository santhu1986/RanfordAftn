package com.ebanking.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	 
		//Instance Class
		
		Library LB=new Library();
		
		String Rval=LB.OpenApp("http://122.175.8.158/ranford2");
		System.out.println(Rval);
		LB.AdmLgn("Admin","Mq$ystems@");
		Rval=LB.Branches("Hdfcsrnagarbnk","Ammerpet","12356","INDIA","GOA","GOA");
		System.out.println(Rval);
	}

}
