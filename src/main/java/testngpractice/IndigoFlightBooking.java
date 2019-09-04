package testngpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IndigoFlightBooking {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Programming Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goindigo.in/");
		
		driver.findElement(By.xpath("//input[@class=\"form-control or-src-city parsley-success\"]")).click();
		
		Actions actions = new Actions(driver);
		//actions.moveToElement(driver.findElement(By.xpath("//input[@class=\"form-control or-src-city\"]"))).build().perform();
		//actions.moveToElement(driver.findElement(By.xpath("//input[@class=\"form-control or-dest-city\"]"))).build().perform();
		driver.findElement(By.linkText("Chhatrapati Shivaji Maharaj International Airport")).click();
		actions.click();

	}

}
