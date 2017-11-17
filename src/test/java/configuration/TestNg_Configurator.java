package configuration;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.pageObject.Landing;
import com.pageObject.Login;
import com.pageObject.Worksheet_delete;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import library.*;

public class TestNg_Configurator {
	public static WebDriver driver;
	public Log log;
	public Browser_factory b;
	public Login loginpage;
	public Implicit_timeout Wait;
	public ExtentReports r;
	public Screenshot s;
	public ExtentTest logger;
	public String filepath;
	public Landing landing;
    public Worksheet_delete wd;
 
    
    
	public TestNg_Configurator()  {
		b = new Browser_factory();
		driver = b.initiate_browser("chrome");
		log = new Log();
		s = new Screenshot(driver);
		Wait = new Implicit_timeout(driver);
	
	
		r = new ExtentReports("E:\\Siddhartha\\Projects\\Automation-neon\\com.worksheet_admin\\reports\\report.html");
		landing = PageFactory.initElements(driver, Landing.class);
		loginpage = PageFactory.initElements(driver, Login.class);
		wd =PageFactory.initElements(driver, Worksheet_delete.class);

	}

	@BeforeSuite
	public void before_suite() {
		driver.get("http://uatmath2shine.azurewebsites.net/uatadmin");
		driver.manage().window().maximize();

		log.tracelog("Test started");

	}

	@BeforeTest
	public void login() {
		try {
			logger = r.startTest("Test initiated");
			loginpage.Enter_credentials("orgadmin", "1234567");
			loginpage.Click_loginbutton();
			
		} catch (Exception e) {

		System.out.println(e.getMessage());
		}

	}

	@AfterTest
	public void teardown() {

		log.tracelog("Test finished");
		r.endTest(logger);
		r.flush();

		driver.get("E:\\Siddhartha\\Projects\\Automation-neon\\com.worksheet_admin\\reports\\report.html");
	}

	@AfterMethod
	public void tracerror(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {

			try {

				filepath = s.Capturescreenshot(driver, result.getName());

				System.out.println(filepath);

				logger.log(LogStatus.FAIL, result.getName() + "-------Fail", logger.addScreenCapture(filepath));

			} catch (Exception e) {

				System.out.println("Exception while taking screenshot " + e.getMessage());
			}

		}

		else {

			logger.log(LogStatus.PASS, result.getName() + "--------pass");

		}

	}
}
