package com.shoppersStack.testScripts;

import java.io.IOException;
import java.security.Key;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseTest;
import com.shoppersStack.pom.Address_Form_Page;
import com.shoppersStack.pom.MyAddress_Page;
import com.shoppersStack.pom.MyProfile_Page;

public class update_address_Test extends BaseTest {
	@Test
	public void updateAdd() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		homePage.getAccountsetting().click();
		Thread.sleep(3000);
		homePage.getMyprofile().click();
		
		MyProfile_Page myProfile=new MyProfile_Page(driver);
		Thread.sleep(2000);
		myProfile.getMyaddressbtn().click();
		Thread.sleep(2000);
		MyAddress_Page myaddress=new MyAddress_Page(driver);
		myaddress.getEditbtn().click();
		Thread.sleep(2000);
		
		Address_Form_Page addForm=new Address_Form_Page(driver);
//		addForm.getNameTF().clear();
		addForm.getNameTF().sendKeys(Keys.CLEAR);
		Thread.sleep(2000);
		addForm.getNameTF().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 0));
		
		Thread.sleep(2000);
		addForm.getUpdateAddbtn().click();
		
//		upAddress.getuAname().clear();
//		Thread.sleep(2000);
//		upAddress.getuAname().sendKeys("Jspiders");
//		Thread.sleep(2000);
//		upAddress.getUpdateAddbtn().click();
	}
}
