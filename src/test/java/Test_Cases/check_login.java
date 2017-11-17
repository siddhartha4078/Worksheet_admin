package Test_Cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class check_login extends configuration.TestNg_Configurator {
	

	@Test
	public void Login() throws InterruptedException, IOException {
		

		try {
			loginpage.Enter_credentials("orgadmin", "1234567");
			loginpage.Click_loginbutton();
			Wait.wait(5);
		} catch (Exception e) {
			
			//e.printStackTrace();
		}
		
	
	}

	
	}


