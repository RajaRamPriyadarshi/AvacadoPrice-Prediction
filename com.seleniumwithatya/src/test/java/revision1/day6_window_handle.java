package revision1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day6_window_handle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		driver.findElement(By.name("145newbrowsertab234")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[5]/a"));
		Set<String>baby=driver.getWindowHandles();
		
		for (String i:baby) {
			if (!i.equals(parent));
			driver.switchTo().window(i);
			System.out.println("baby tab id"+baby);
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[5]/a")).click();
			Thread.sleep(8000);
			driver.close();
		}
		driver.quit();
	}

}
