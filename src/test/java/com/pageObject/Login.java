package com.pageObject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


import library.heighlight;

public class Login {
	public WebDriver driver;
	public heighlight h;

	public Login(WebDriver dr){
		this.driver=dr;
		h = new heighlight(driver);
	}
	
	@FindBy(name = "UserName")
	@CacheLookup
	WebElement logInUserName;

	@FindBy(name = "Password")
	@CacheLookup
	WebElement logInPassword;

	@FindBy(css = "button[ng-click^='Authenticate']")
	@CacheLookup
	WebElement logInButton;

	@FindBy(css = "input[type='checkbox']")
	@CacheLookup
	WebElement rememberMeCheck;

	@FindBy(partialLinkText = "Forgot Password?")
	WebElement forgotPasswordLink;

	public void Enter_credentials(String uname,String paswd) {
		h.h(logInUserName);
		logInUserName.sendKeys(uname);
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		h.h(logInPassword);
		logInPassword.sendKeys(paswd);
	}
	
	public void Click_loginbutton(){
		h.h(logInButton);
		logInButton.click();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	

}
