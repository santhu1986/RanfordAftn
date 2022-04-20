package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	       //Instance Class
		
		Library LB=new Library();
		
		LB.OpenApp("http://122.175.8.158/ranford2");
		LB.AdmLgn("Admin","Mq$ystems@");
		
		//To get Test Data File Path
		
		String Fpath="E:\\SeleniumEvngMarch\\Ebanking\\src\\com\\ebanking\\testdata\\Role.txt";
		
		//Results File path
		
		String Rpath="E:\\SeleniumEvngMarch\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.txt";
		String SD;
		
		//To get Test Data File
		
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);
		
		//To Write Header Line
		
		FileWriter FW=new FileWriter(Rpath);
		BufferedWriter BW=new BufferedWriter(FW);
		BW.write(Sread);
		BW.newLine();
		
		//While Loop

		while((SD=BR.readLine())!=null) 
		{
			System.out.println(SD);
			
			//Split
			
			String SR[]=SD.split("###");
			
			    String Rn=SR[0];
			    String Rt=SR[1];
			    
			    String Res=LB.Role(Rn,Rt);
			    
			    
			    //Results
			    
			    BW.write(SD+"#*%%"+Res);
			    BW.newLine();
		}

		BW.close();
		BR.close();
	}

}
