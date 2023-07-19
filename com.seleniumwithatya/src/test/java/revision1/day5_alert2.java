package revision1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_alert2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		
		alt.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.id("timerAlertButton")).click();
		Alert alt1=driver.switchTo().alert();
		//System.out.println(alt.getText());
		Thread.sleep(10000);
		
		alt1.accept();
		driver.close();
	}

}
