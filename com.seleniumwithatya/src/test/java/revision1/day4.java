package revision1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement o=driver.findElement(By.id("box1"));
		WebElement O=driver.findElement(By.id("box101"));
		act.dragAndDrop(o,O);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		WebElement s=driver.findElement(By.id("box2"));
		WebElement S=driver.findElement(By.id("box102"));
		act.dragAndDrop(s,S).build().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		WebElement w=driver.findElement(By.id("box3"));
		WebElement W=driver.findElement(By.id("box103"));
		act.dragAndDrop(w,W).build().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		WebElement c=driver.findElement(By.id("box4"));
		WebElement C=driver.findElement(By.id("box104"));
		act.dragAndDrop(c,C).build().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		WebElement ss=driver.findElement(By.id("box5"));
		WebElement SSS=driver.findElement(By.id("box105"));
		act.dragAndDrop(ss,SSS).build().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		WebElement r=driver.findElement(By.id("box6"));
		WebElement R=driver.findElement(By.id("box106"));
		act.dragAndDrop(r,R).build().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		WebElement m=driver.findElement(By.id("box7"));
		WebElement M=driver.findElement(By.id("box107"));
		act.dragAndDrop(m,M).build().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		driver.close();
		
	}

}
