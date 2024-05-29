package com.shoppersStack.generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {
Select sel;
Actions act;

	public void selectByIndex(WebElement ele,int index)
	{
		sel=new Select(ele); 
		sel.selectByIndex(index);
	}
	
	public void selectByValue(WebElement ele,String value)
	{
		sel=new Select(ele);
		sel.selectByValue(value);
	}
	
	public void selectByVisibleText(WebElement ele,String text)
	{
		sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	
	public void deselectByIndex(WebElement ele,int index)
	{
		sel=new Select(ele); 
		sel.deselectByIndex(index);
	}
	
	public void deSelectByValue(WebElement ele,String value)
	{
		sel=new Select(ele);
		sel.deselectByValue(value);
	}
	
	public void deSelectByVisibleText(WebElement ele,String text)
	{
		sel=new Select(ele);
		sel.deselectByVisibleText(text);
	}
	
	public void deSelectAll(WebElement ele)
	{
		sel=new Select(ele);
		sel.deselectAll();
		
	}
	
	public void takeScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("");
		FileHandler.copy(src, dest);
		
	}
	
	public void takeElementScreenshot(WebElement ele) throws IOException
	{
		File temp=ele.getScreenshotAs(OutputType.FILE);
		File dest=new File("");
		
		FileHandler.copy(temp, dest);
	}
	
	public void moveToElement(WebDriver driver,WebElement ele)
	{
		act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	
}
