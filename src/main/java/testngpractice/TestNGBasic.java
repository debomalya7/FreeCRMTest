package testngpractice;

import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic {
	@BeforeSuite //1
	public void setup() {
		System.out.println("@BeforeSuite -- set up browser properties");
	}
	@BeforeTest //2
	public void launchbrowser() {
		System.out.println("@BeforeTest -- launch browser");
	}
	
	@BeforeClass //3
	public void login() {
		System.out.println("@BeforeClass -- login");
	}
	@BeforeMethod //4
	public void URL(){
		System.out.println("@BeforeMethod --enter url");
	}
	// testcase starting with @Test 
	
	@Test //5
	public void titletest() {
		System.out.println("@Test -- title test");
	}
	@Test
	public void bounce() {
		System.out.println("@Test -- bounce");
	}
	@AfterMethod //6  
	public void logout() {
		System.out.println("@AfterMethod --logout");
	}
	@AfterClass //7
	public void closebrowser() {
		System.out.println("@AfterClass -- close browser");
	}
	@AfterTest //8
	public void deleteallcookies() {
		System.out.println("@AfterTest -- delete all cookies");
	}
	
	

}
