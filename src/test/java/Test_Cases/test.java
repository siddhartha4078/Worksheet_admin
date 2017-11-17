package Test_Cases;

import java.io.IOException;

import org.testng.annotations.Test;


import library.dataxlconfig;

public class test {
	
	public test(){
		
		super();
	}
	
	 public static void main(String []args) throws IOException{
		 
		 
		 dataxlconfig e = new dataxlconfig("E:\\Siddhartha\\Projects\\Automation-neon\\com.worksheet_admin\\src\\test\\resources\\dropdown_worksheets.xlsx");
	
		 int rows= e.rowcount(0);
		   
		   Object [][] testdata = new  Object [rows][1];
		   
		   for (int i=0;i<rows;i++){
			   
			   testdata [i][0] = e.getdata("English",i,1);
		   
		       System.out.println(testdata);
		 
		 
		   }
		
	 }

	}


