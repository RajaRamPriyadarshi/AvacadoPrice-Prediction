package revision1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day3 {

	private static final By SelectByvalue = null;

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://www.facebook.com/signup");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("choootta");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bsdk");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("gandu@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("kuttakamina");
	Thread.sleep(2000);
	
	WebElement day=driver.findElement(By.id("day"));
	Select obj=new Select(day);
	obj.selectByValue("3");
	Thread.sleep(3000);
	
	WebElement mon=driver.findElement(By.id("month"));
	Select mont=new Select(mon);
	mont.selectByVisibleText("Mar");
	Thread.sleep(3000);
	
	WebElement year=driver.findElement(By.id("year"));
	Select yar=new Select(year);
	yar.selectByValue("1993");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[text()='Male']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[text()='Sign Up']")).click();
	Thread.sleep(5000);
	
	driver.close();
	}

	}


