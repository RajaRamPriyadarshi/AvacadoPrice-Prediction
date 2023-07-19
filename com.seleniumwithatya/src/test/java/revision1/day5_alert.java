package revision1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_alert {

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
		System.out.println(alt1.getText());
		//Thread.sleep(8000);
		
		alt1.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirmButton")).click();
		Alert alttcnf=driver.switchTo().alert();
		System.out.println(alttcnf.getText());
		Thread.sleep(3000);
		
		alttcnf.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.id("promtButton")).click();
		Alert altpb=driver.switchTo().alert();
		System.out.println(altpb.getText());
		Thread.sleep(3000);
		
		altpb.accept();
		Thread.sleep(5000);
		driver.close();
	}

}
