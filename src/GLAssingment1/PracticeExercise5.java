
package GLAssingment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver_win32 (1)\\chromedriver.exe");

//	Launch new Browser and open url 
WebDriver driver =new ChromeDriver();
driver.get("http://toolsqa.com/automation-practice-form/");
Thread.sleep(1000);
//Click on the Link “Partial Link Test” 
driver.findElement(By.partialLinkText("Partial")).click();
		Thread.sleep(2000);
		
		//Identify Submit button with ‘tagName’
		String tagtext=driver.findElement(By.id("submit")).getAttribute("id");
		System.out.println(tagtext);
Thread.sleep(2000);
//Click on the Link “Link Test” 
		driver.findElement(By.linkText("Link Test")).click();
		Thread.sleep(2000);
		
//		Close the Browser
		driver.quit();

	}

}
