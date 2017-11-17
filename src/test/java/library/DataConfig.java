package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DataConfig {
	HSSFWorkbook wb;
	HSSFSheet sh;
	
	public DataConfig(String Excelpath) {

		try {
		
		
		File scr = new File(Excelpath);
		
		FileInputStream fis = new FileInputStream(scr);
		
	     wb = new HSSFWorkbook(fis);	
	    
	
	}
		
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		}
		
	public String getData(int Sheetnumber,int row,int column) throws IOException{
		
		  sh =wb.getSheetAt( Sheetnumber);
		
		
		String Record1= sh.getRow(row).getCell(column).getStringCellValue();
		return  Record1;
	}

	 
	public int getrow(int sheetindex){
	
		int row =wb.getSheetAt(sheetindex).getLastRowNum();
		
		row= row+1;
		return row;
		
		
	}
	
	}
	
	
	

