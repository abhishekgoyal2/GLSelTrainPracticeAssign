package GLAssingment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver_win32 (1)\\chromedriver.exe");

//	Launch new Browser 		
WebDriver driver =new ChromeDriver();
//	Open DemoQA.com website
		driver.get("http://demoqa.com/");
		Thread.sleep(1000);
//			Click on Registration link using “driver.findElement(By.xpath(“.//*[@id=’menu-item-374′]/a”)).click();“
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		Thread.sleep(1000);
//Come back to Home page (Use ‘Back’ command)

		driver.navigate().back();
		Thread.sleep(2000);
//		Again go back to Registration page (This time use ‘Forward’ command)
		driver.navigate().forward();
		Thread.sleep(3000);
//	Again come back to Home page (This time use ‘To’ command)
		driver.navigate().to("http://demoqa.com/");
		Thread.sleep(3000);
//	Refresh the Browser (Use ‘Refresh’ command)
		driver.navigate().refresh();
		Thread.sleep(2000);
//		Close the Browser
		driver.quit();

	}

}
