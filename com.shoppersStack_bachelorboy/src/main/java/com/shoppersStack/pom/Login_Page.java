package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public Login_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="Email")
	private WebElement emailtf;
	
	@FindBy(id="Password")
	private WebElement passtf;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginbtn;

	public WebElement getEmailtf() {
		return emailtf;
	}

	public WebElement getPasstf() {
		return passtf;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
}
