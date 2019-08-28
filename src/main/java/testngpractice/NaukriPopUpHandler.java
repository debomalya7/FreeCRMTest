package testngpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NaukriPopUpHandler {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Programming Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		System.setProperty("webdriver.edge.driver", "F:\\Programming Software\\Selenium\\edgedriver_win64\\MicrosoftWebDriver.exe");
//		System.setProperty("webdriver.ie.driver", "F:\\Programming Software\\Selenium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver = new ChromeDriver();
//		driver = new InternetExplorerDriver();
//		driver = new EdgeDriver();
		
		driver.get("https://www.naukri.com/");
		String mainPage = driver.getTitle();
		System.out.println("The window handler id of " + driver.getTitle()+" is : "+driver.getWindowHandle());
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Total number of Windows Opened is : " + windowHandles.size());
		for (String wh : windowHandles) {
			driver.switchTo().window(wh);
			System.out.println("The Website title is : "+driver.getTitle()+" and the window handler id is : "+wh);
			if(driver.getTitle().equals("Amazon")) {
				driver.close();
			}
		
		}
		
	}

}
