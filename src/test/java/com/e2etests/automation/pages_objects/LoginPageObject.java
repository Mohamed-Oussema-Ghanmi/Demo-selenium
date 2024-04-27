package com.e2etests.automation.pages_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class LoginPageObject {

	//recherche des elements
	@FindBy(how = How.ID,using = "user-name")
	public static WebElement username;
	
	@FindBy (how = How.ID,using = "password")
	public static WebElement passowrd;
	
	@FindBy (how = How.ID,using = "login-button")
	public static WebElement btnLogin;
	
	@FindBy (how = How.XPATH,using = "//span[@class='title']")
	public static WebElement title;
	
	public LoginPageObject ()
	{
		PageFactory.initElements(Setup.getDriver(),this);
		
	}
	
	//Methode
	public void connectToApp()
	{
		Setup.getDriver().get("https://www.saucedemo.com/");
	}
	public void fillUsername(String usr)
	{
		username.clear();
		username.sendKeys(usr);
	}
	public void fillPasword(String pwd)
	{
		passowrd.clear();
		passowrd.sendKeys(pwd);
	}
	public void clickBtn()
	{
		btnLogin.click();
	}
}
