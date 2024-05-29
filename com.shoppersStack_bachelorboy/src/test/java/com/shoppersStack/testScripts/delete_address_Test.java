package com.shoppersStack.testScripts;

import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseTest;
import com.shoppersStack.pom.MyAddress_Page;
import com.shoppersStack.pom.MyProfile_Page;

public class delete_address_Test extends BaseTest {
@Test
public void delAddress() throws InterruptedException
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
	myaddress.getDeladdressbtn().click();
	Thread.sleep(2000);
	myaddress.getYesbtn().click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	
	
	
	
}
}
