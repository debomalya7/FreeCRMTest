package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath = "//a[@title=\"Contacts\"]")
	WebElement contactlink;
	
	@FindBy(xpath = "//select[@name=\"title\"]")
	WebElement title;
	
	@FindBy(id = "first_name")
	WebElement firstname;

}
