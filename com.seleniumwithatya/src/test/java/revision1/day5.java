package revision1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=sunnyy+leone&oq=sunnyy+leone&aqs=chrome..69i57.7717j1j7&sourceid=chrome&ie=UTF-8");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='O3S9Rb'][normalize-space()='Images']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile,new File("C:\\Users\\babam\\eclipse-workspace\\sunnypic1.png"));
		System.out.println("screenshot captured");
		driver.close();
	}

}
