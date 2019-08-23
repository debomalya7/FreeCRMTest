package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase  {
	HomePage homePage;
	LoginPage loginPage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
        loginPage = new LoginPage();
        contactsPage = new ContactsPage();
        homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void homePageTitleTest() {
		String title2=homePage.verifyHomepageTitle();
		Assert.assertEquals(title2, "CRMPRO","Home Page Title Not Matched");
	}
	
	@Test(priority = 2)
	public void verifyUserNameTest() {
		testUtil.switchToFrame();
		Assert.assertTrue(homePage.homePageLebel());
	}
	
	@Test(priority = 3)
	public void verifyContactPageTest() {
		testUtil.switchToFrame();
		contactsPage = homePage.clickOnContacts();
		
	}
	
	
	@AfterMethod
	public void taerDown() {
		driver.close();
	}

}
