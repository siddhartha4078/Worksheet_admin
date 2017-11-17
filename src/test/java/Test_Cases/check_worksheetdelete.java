package Test_Cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.dataxlconfig;

public class check_worksheetdelete extends check_login{

	public check_login l;
	public WebDriver driver;
	
	

	@Test ()
	public void navigate() throws InterruptedException, IOException {
		landing.click_on_WorksheetCreationlink();

		landing.WorksheetCreation_Select_page("worksheetdelete");
		Thread.sleep(5000);	

	}

	@Test 
	public void search_worksheet() throws InterruptedException {

		wd.select_culture("English");
		wd.Enter_worksheetname("name");
		wd.click_seachbutton();

	}

	  
	
}
