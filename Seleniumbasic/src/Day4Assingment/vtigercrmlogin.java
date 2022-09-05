package Day4Assingment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtigercrmlogin {

	

	public static void main(String[] args) {
       
		String Pooja = System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Pooja);
		
		WebDriver dri2 = new ChromeDriver();
		
		//dri2.manage().window().maximize();
		
		//dri2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dri2.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		dri2.manage().window().maximize();
		
		String currentURL= dri2.getCurrentUrl();
		String ExpectedURL="https://demo.vtiger.com/vtigercrm/index.php";
		System.out.println("The current URL is :" +currentURL);
		System.out.println("Compare a Current URL :"+ currentURL.equals(ExpectedURL));
		
		String pagesource = dri2.getPageSource();
		System.out.println("The page source is :" +pagesource.length());
		
	   
		
		
		
		
	}

}
