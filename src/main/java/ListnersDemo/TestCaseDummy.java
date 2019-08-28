package ListnersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListnersDemo.TestNGListeners.class)
public class TestCaseDummy {
	
	
	@Test
	public void googleTitleTest() {
		System.setProperty("webdriver.chrome.driver", "F:\\Programming Software\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("the title of the page is :"+driver.getTitle());
		//Assert.assertEquals("Google", "Googlee","testcase failed: title doesn't match");
		driver.quit();
		
	}

}
