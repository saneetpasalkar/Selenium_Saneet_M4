package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress_Page {
public MyAddress_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton')]")
private WebElement addadressbtn;

@FindBy(xpath = "(//span[contains(@class,'MuiButton')])[4]")
private WebElement deladdressbtn;

@FindBy(xpath = "(//button[text()='Yes'])[2]")
private WebElement yesbtn;

@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon')])[3]")
private WebElement editbtn;

public WebElement getAddadressbtn() {
	return addadressbtn;
	
	
}

public WebElement getDeladdressbtn() {
	return deladdressbtn;
}

public WebElement getYesbtn() {
	return yesbtn;
}

public WebElement getEditbtn() {
	return editbtn;
}




}
