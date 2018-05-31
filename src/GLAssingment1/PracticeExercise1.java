package GLAssingment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver_win32 (1)\\chromedriver.exe");

//Opening the chrome driver and 		
WebDriver driver =new ChromeDriver();
		driver.get("http://store.demoqa.com/");
		
		//Getting page title and title lenght
		String Pagetitle=driver.getTitle();
		System.out.println(Pagetitle);
		
		By username;
		
		int Pagetitlesize=Pagetitle.length();
		System.out.println(Pagetitlesize);
		
		
		//Get current url and check if it is expected or not
		String curenturl=driver.getCurrentUrl();
		String expurl="http://store.demoqa.com/products-page/product-category/";
//		String expurl="http://store.demoqa.com/";
		if(curenturl.equals(expurl))
		{
			System.out.println("currenturl is expected url" + curenturl);
		}
		else
		{
			System.out.println("currenturl is not matching expected url" );
		}
		
		//Get page source and printlength
		String Pagesource =driver.getPageSource();
		System.out.println(Pagesource);
		int Pagsourcelen=Pagesource.length();
		System.out.println(Pagsourcelen);
		
		driver.close();

	}

}
