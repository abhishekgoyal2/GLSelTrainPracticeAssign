package GLAssingment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver_win32 (1)\\chromedriver.exe");

//Opening the chrome driver and 		
WebDriver driver =new ChromeDriver();
		driver.get("http://demoqa.com/frames-and-windows/");

		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		Thread.sleep(800);
		

		
		driver.quit();

	}

}
