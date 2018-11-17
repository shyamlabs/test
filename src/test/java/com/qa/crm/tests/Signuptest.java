package com.qa.crm.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.pages.signup;
import com.qa.crm.base.testbase;
import com.qa.util.Testutil;

public class Signuptest extends testbase {
	String SheetName = "sheet1";
	Testutil Testutil;
	signup signup;
	
	public Signuptest(){
		super();
		
}


@BeforeMethod
public void setUp() throws InterruptedException {
	
	initialization();
	Testutil = new Testutil();
	signup = new signup();
	
}







	



@DataProvider
public Object[][] getTestData(){
	Object data[][] = Testutil.getTestData(SheetName);
	return data;
}


@Test(priority=4, dataProvider="TestData")
public void validateCreateNewContact(String title, String firstName, String lastName, String company){
	
	
	
}



@AfterMethod
public void tearDown(){
	driver.quit();
}




}


