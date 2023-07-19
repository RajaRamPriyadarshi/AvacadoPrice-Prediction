package revision1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
WebDriver driver= new EdgeDriver();
driver.get("http://www.cacert.org/");
driver.manage().window().maximize();
Thread.sleep(10000);
driver.quit();
	}

}
