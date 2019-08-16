package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//td[contains(text(),'User: Debomalya Roy')]")
	WebElement usernamelebel;
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactElement;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]" )
	WebElement dealElement;
	
	@FindBy(xpath = "//a[contains(text(),'Email')]" )
	WebElement EmailElement;
	
	
	//initialize page object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomepageTitle() {
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContacts() {
		contactElement.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDeals() {
		dealElement.click();
		return new DealsPage();
	}
	
	public EmailPage clickOnEmail() {
		EmailElement.click();
		return new EmailPage();
	}
	
	public boolean homePageLebel() {
		return usernamelebel.isDisplayed();
	}

}
