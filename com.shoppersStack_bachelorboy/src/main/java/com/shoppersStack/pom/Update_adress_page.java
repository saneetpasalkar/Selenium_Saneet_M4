package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Update_adress_page {
	public Update_adress_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Name")
	private WebElement uAname;
	
	@FindBy(id = "Update Address")
	private WebElement updateAddbtn;

	public WebElement getuAname() {
		return uAname;
	}

	public WebElement getUpdateAddbtn() {
		return updateAddbtn;
	}
	
	
	
}
