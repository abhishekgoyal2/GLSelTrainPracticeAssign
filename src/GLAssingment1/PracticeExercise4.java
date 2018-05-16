package GLAssingment1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver_win32 (1)\\chromedriver.exe");

//	Launch new Browser 		
WebDriver driver =new ChromeDriver();
//	Open website
		driver.get("http://toolsqa.com/automation-practice-form/");
		Thread.sleep(1000);
//Enter first and Last name
		driver.findElement(By.name("firstname")).sendKeys("Rajesh");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("singh");
		Thread.sleep(2000);
		//Click on Submit button
			
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
//		Close the Browser
		driver.quit();

	}

}
