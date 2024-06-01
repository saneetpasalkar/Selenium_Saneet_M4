package com.shoppersStack.testScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseTest;
import com.shoppersStack.generic.Listerners_utility;
import com.shoppersStack.pom.Address_Form_Page;
import com.shoppersStack.pom.MyAddress_Page;
import com.shoppersStack.pom.MyProfile_Page;
@Listeners(Listerners_utility.class)
public class add_adress_Test extends BaseTest{
@Test
public void addAddress() throws IOException, InterruptedException 
{
	Thread.sleep(3000);
	homePage.getAccountsetting().click();
	Thread.sleep(3000);
	homePage.getMyprofile().click();
	
	MyProfile_Page myProfile=new MyProfile_Page(driver);
	Thread.sleep(3000);
	myProfile.getMyaddressbtn().click();
	MyAddress_Page addressPage=new MyAddress_Page(driver);
	Thread.sleep(3000);
	addressPage.getAddadressbtn().click();
	
	Address_Form_Page addForm=new Address_Form_Page(driver);
	
	addForm.getNameTF().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 0));
	Thread.sleep(1000);
	addForm.getHouseTF().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 1));
	Thread.sleep(1000);
	addForm.getStreetTF().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 2));
	Thread.sleep(1000);
	addForm.getLandmarkTF().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 3));
	Thread.sleep(1000);
	util.selectByValue(addForm.getCountryDD(), utility.readDataFromPropertyFile("country"));
	Thread.sleep(1000);
	util.selectByValue(addForm.getStateDD(), utility.readDataFromPropertyFile("state"));
	Thread.sleep(1000);
	util.selectByValue(addForm.getCityDD(), utility.readDataFromPropertyFile("city"));
	Thread.sleep(1000);
	
	addForm.getPincodeTF().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 4));
	Thread.sleep(1000);
	addForm.getPhonenoTF().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 5));
	Thread.sleep(1000);
	addForm.getAddAddressbtn().click();
	Thread.sleep(3000);
	
	
	
}
}
