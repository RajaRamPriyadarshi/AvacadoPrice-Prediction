package revision1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7_scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		JavascriptExecutor jr=(JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(5000);
		
	}

}
