package testngpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HalfEbay {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "F:\\\\Programming Software\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.com/reg/PartialReg?rv4=1");
	}
	
	@DataProvider
	public Iterator<Object[]> getData() {
		ArrayList<Object[]> testdata =  TestUtilDataProvider.getDataFromExel();
		return testdata.iterator();
	}
	
	@Test(dataProvider = "getData")
	public void HalfEbayTest(String firstname,String lastname,String email, String password) {
		driver.findElement(By.xpath("//input[@id=\"firstname\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//input[@id=\"lastname\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@id=\"PASSWORD\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"PASSWORD\"]")).sendKeys(password);
		
		//driver.findElement(By.xpath("//button[@id=\"ppaFormSbtBtn\"]")).click();

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
