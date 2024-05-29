package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	
	public Home_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@aria-label='Account settings']")
	private WebElement accountsetting;
	
	@FindBy(xpath="(//li[@role='menuitem'])[1]")
	private WebElement myprofile;
	
	@FindBy(xpath="(//li[contains(@class,'gutters css-1km1ehz')])[6]")
	private WebElement logoutbtn;
	
	public WebElement getAccountsetting() {
		return accountsetting;
	}

	public WebElement getMyprofile() {
		return myprofile;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	
	
	
}
