package com.app.tbhframework.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.app.tbhframework.Driver.HashMapNew;
import com.app.tbhframework.Reporting;
import com.app.util.TBHBaseUtil;

public class SetBrowserHeader extends TBHBaseUtil {
	public SetBrowserHeader(WebDriver driver, String driverType, HashMapNew Dictionary, HashMapNew Environment, Reporting Reporter, com.app.tbhframework.Assert Assert, com.app.tbhframework.SoftAssert SoftAssert) {
		super(driver, driverType, Dictionary, Environment, Reporter, Assert, SoftAssert);
	}

	public void addHeaders(){
		driver.get("chrome-extension://innpjfdalfhpcoinfnehdnbkglpmogdi/options.html");
		driver.findElement(By.xpath("//button[@tooltip='Add New']")).click();
		WebElement actionElem = driver.findElement(By.name("action"));
		Select select = new Select(actionElem);
		select.selectByVisibleText("Add");
		WebElement nameElem = driver.findElement(By.name("name"));
		nameElem.sendKeys("x-forwarded-for");
		WebElement valueElem = driver.findElement(By.name("value"));
		valueElem.sendKeys("171.48.0.1");
		WebElement descElem = driver.findElement(By.name("description"));
		descElem.sendKeys("");
		driver.findElement(By.xpath("//button[@tooltip='Save']")).click();	
		driver.findElement(By.xpath("//button[@tooltip='Add New']")).click();
		actionElem = driver.findElement(By.name("action"));
		select = new Select(actionElem);
		select.selectByVisibleText("Add");
		nameElem = driver.findElement(By.name("name"));
		nameElem.sendKeys("x-msisdn");
		valueElem = driver.findElement(By.name("value"));
		valueElem.sendKeys("919971512191");
		descElem = driver.findElement(By.name("description"));
		descElem.sendKeys("GJ Prepaid");
		driver.findElement(By.xpath("(//button[@tooltip='Save'])[2]")).click();
		driver.findElement(By.xpath("//button[@tooltip='Add New']")).click();
		actionElem = driver.findElement(By.name("action"));
		select = new Select(actionElem);
		select.selectByVisibleText("Add");
		nameElem = driver.findElement(By.name("name"));
		nameElem.sendKeys("x-rat");
		valueElem = driver.findElement(By.name("value"));
		valueElem.sendKeys("2");
		descElem = driver.findElement(By.name("description"));
		descElem.sendKeys("2G");
		driver.findElement(By.xpath("(//button[@tooltip='Save'])[3]")).click();
		driver.findElement(By.xpath("//button[@tooltip='Start Modifying Headers']")).click();		
		driver.findElement(By.xpath("//button[@tooltip='Enable All']")).click();
		driver.findElement(By.xpath("//div[@class='modal-content']//button[@ng-click='yes()']")).click();
	}
	
	public boolean handlePopups(){
		boolean flag = false;
		if(driverType.trim().toUpperCase().contains("ANDROID")){
			for(int i = 0; i < 10; i++){
				if(checkIfElementPresent(By.id("notInterested"), 2)){
					flag = true;
	    			driver.findElement(By.id("notInterested")).click();
	    			continue;
				}
				break;
			}
		}
		return flag;
	}
}