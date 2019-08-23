package testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\\\Programming Software\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.id("search")).sendKeys("unbox therapy");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("//*[@id=\"channel-title\"]/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"tabsContent\"]/paper-tab[2]/div")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

}
