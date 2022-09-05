package Day4Assingment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimelogin {

	public static void main(String[] args) {
        
		String Pooja = System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Pooja);
		
		WebDriver dri3 = new ChromeDriver();
		
		dri3.get("https://demo.actitime.com/login.do");
		
		
		
		
		String pageTitle = dri3.getTitle();
		String expectedTitle="actiTIME - Login";
		System.out.println("The page title is :" +pageTitle.equals(expectedTitle));
		System.out.println("The page Title :" +pageTitle);
		System.out.println("The page Title lenght :" +pageTitle.length());
		
	
		
		String sourceContent = dri3 .getPageSource();
		System.out.println("Source Content Lenght :" +sourceContent.length());
		
		String PageURL = dri3 .getCurrentUrl();
		System.out.println("Page URL is a :" +PageURL);
		String expectedURL ="https://demo.actitime.com";
		System.out.println("Page URL validation :" + PageURL .contains(expectedURL));
		

		
		WebElement username = dri3.findElement(By.id("username"));		
		username.sendKeys("admin");
		
		WebElement pwd = dri3.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		
		WebElement login = dri3.findElement(By.className("initial"));
		login.click();
		
		
		
		//Another way to declare 
		
		dri3.findElement(By.id("username")).sendKeys("admin");
		
		dri3.findElement(By.name("pwd")).sendKeys("manager");
		
		dri3.findElement(By.className("initial"));
		login.click();
		
		
	}

}

/**
Shubham Mopari7:04 AM
Is there lectures today
Akhilesh Kadu7:04 AM
yes wait
Admin Acceleration9:04 AM
Perform following operations on the application
1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. Verify login page elements


Perform following operations on the application
1. Open any browser
2. Enter the url as https://demo.actitime.com/login.do
3. Verify login page elements

Perform following operations on the application
1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. verify login page
4. enter username and password
ens-evtw-mso
**/