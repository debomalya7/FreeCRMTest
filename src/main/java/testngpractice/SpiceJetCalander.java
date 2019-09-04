package testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetCalander {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Programming Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		WebElement dateElement = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String date1="12-11-2019";
		selectDateByJs(driver, dateElement, date1);
				
	}
	
	public static void selectDateByJs(WebDriver driver, WebElement element, String date) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
		
		
	}

}
