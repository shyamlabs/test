package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.crm.base.testbase;

public class signup extends testbase {
	@FindBy(xpath = "//*[@id=\\'tblcrtac\\']/tbody/tr[3]/td[3]/input")
	@CacheLookup
	WebElement userName;

	@FindBy(xpath = "//*[@id=\\'tblcrtac\\']/tbody/tr[7]/td[3]/input[1]")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\\'tblcrtac\\']/tbody/tr[7]/td[3]/input[2]")
	WebElement password;
	

	

	// Initializing the Page Objects:
	public signup() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName(){
		return userName.isDisplayed();
	}
	
	public void createNewContact(String title, String ftName, String ltName, String comp){
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		
		userName.sendKeys(ftName);
		email.sendKeys(ltName);
		password.sendKeys(ltName);
		
		
	}
	

	

	
	
	
	
	
	
	

}



