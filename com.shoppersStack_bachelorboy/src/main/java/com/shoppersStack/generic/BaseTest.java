package com.shoppersStack.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.shoppersStack.pom.Home_Page;
import com.shoppersStack.pom.Login_Page;
import com.shoppersStack.pom.Update_adress_page;
import com.shoppersStack.pom.Welcome_Page;

public class BaseTest {
public WebDriver driver;
public static WebDriver listnerDriver ;
public File_Utility utility=new File_Utility();
public Welcome_Page welcomePage;
public Login_Page loginPage;
public Home_Page homePage;
public Update_adress_page upAddress=new Update_adress_page(driver);
public ExtentSparkReporter spark;
public ExtentReports reprt;
public ExtentTest test;
public WebDriver_Utility util=new WebDriver_Utility(); 
public Java_Utility javautil=new Java_Utility();
	
@BeforeSuite
public void beforeSuite()
{
System.out.println("BeforeSuite");
}
@BeforeTest

public void beforeTest()
{
System.out.println("BeforeTest");
spark=new ExtentSparkReporter(FrameworkConstants_Utility.reportPath+javautil.localDateTime()+".html");
 reprt=new ExtentReports();
reprt.attachReporter(spark);
 test = reprt.createTest("Demo");


}
@BeforeClass

public void beforeClass() throws IOException
{
System.out.println("BeforeClass");
//String browser=FrameworkConstants_Utility.chromeValue;
//String url=utility.readDataFromPropertyFile("url");
String browser=System.getProperty("browser");
String url=System.getProperty("url");

if (browser.contains("chrome")) {
	driver=new ChromeDriver();
	
} else if(browser.contains("firefox")){
driver=new FirefoxDriver();
}
else if(browser.contains("edge")) {
	driver=new EdgeDriver();
}
else
{
	System.out.println("Enter valid browser name");
}
listnerDriver=driver;
welcomePage=new Welcome_Page(driver);
loginPage=new Login_Page(driver);
homePage=new Home_Page(driver);

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
driver.get(url);
}
@BeforeMethod
public void beforeMethod() throws IOException
{
System.out.println("BeforeMethod");
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
welcomePage.getLoginbtn().click();
loginPage.getEmailtf().sendKeys(utility.readDataFromPropertyFile("email"));
loginPage.getPasstf().sendKeys(utility.readDataFromPropertyFile("password"));
loginPage.getLoginbtn().click();
}
@AfterMethod
public void afterMethod() throws InterruptedException
{
System.out.println("AfterMethod");


Thread.sleep(5000);
homePage.getAccountsetting().click();

homePage.getLogoutbtn().click();
}
@AfterClass
public void afterClass()
{
System.out.println("AfterClass");
driver.quit();
}	
@AfterTest
public void afterTest()
{
System.out.println("AfterTest");
reprt.flush();
}
@AfterSuite

public void afterSuit()
{
System.out.println("AfterSuite");
}
}
