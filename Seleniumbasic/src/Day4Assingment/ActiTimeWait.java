package Day4Assingment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeWait {

	public static void main(String[] args) throws InterruptedException {
		
		String pooja = System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pooja);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String pageTitle = driver .getTitle();
	    String expectedtitle = "actiTIME - Login";
	    System.out.println("The Page Tital Validation is :" + pageTitle.equals(expectedtitle));
	    System.out.println("The PageTitle is :" +pageTitle);
	    
	    
	    String PageSource = driver .getPageSource();
	    System.out.println("The Page Source is :" +PageSource.length());
	    
	    
	    String URL = driver .getCurrentUrl();
	    String expectedUrl = "https://demo.actitime.com";
	    System.out.println("The CurrecntUrl is Validation : " +URL.contains(expectedUrl));
	    System.out.println("The URL is :" +URL);
	    
	   WebElement username = driver .findElement(By.id("username"));
	   username.sendKeys("admin");
	   
	   WebElement pwd = driver.findElement(By.name("pwd"));
	   pwd.sendKeys("manager");
	   
	   WebElement login = driver.findElement(By.id("loginButton"));
	   login.click();
	   
	   //Expicit wait 
	   Thread.sleep(2000);
	   
	   String homepagetitle = driver.getTitle();  
	   System.out.println("The Home Page Title is :" +homepagetitle);
	   System.out.println("The Home Page Validation Status :" +homepagetitle.equals("actiTIME - Enter Time-Track"));
	   
	   WebElement logout = driver.findElement(By.id("logoutLink"));
	   logout.click();
	   
	   
	   System.out.println("Title validation status: "+pageTitle.equals(expectedtitle));
	   
		
	}

}
