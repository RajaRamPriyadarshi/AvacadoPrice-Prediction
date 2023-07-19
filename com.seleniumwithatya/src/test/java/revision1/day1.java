package revision1;

import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","L:\\My Drive\\chromedriver.exe");
	ChromeDriver don=new ChromeDriver();
	don.get("https://xnxx.health/video-157qnl01/how_will_my_friend_feel_if_he_comes_to_know");
	don.manage().window().fullscreen();
	Thread.sleep(20000);
	don.quit();
	}

}
