package testngpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sun.awt.SunToolkit.InfiniteLoop;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "F:\\\\Programming Software\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(priority = 2)
	public void googleTitleTest() {
		driver.get("https://www.google.com");
		String titleString =driver.getTitle();
		System.out.println(titleString);
	}
	
	@Test(priority = 3, invocationCount = 3)
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(priority = 1,timeOut = 3000)
	public void InfiniteLoopTest() {
		int i=1;
		while(i==1) {
			System.out.println("infiniteloop runs for perticular time"+i);
		}
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
