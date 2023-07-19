package revision1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("irctc");
driver.findElement(By.name("btnK")).click();
Thread.sleep(5000);

driver.navigate().to("https://learning.tcsionhub.in/iDH/India/Products_detail/5711659");
driver.close();
	}

}
