package Day4Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehbrmlive {

	public static void main(String[] args) {
       
		String Rudra = System.getProperty("user.dir")+"\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Rudra);
		WebDriver D = new ChromeDriver();
		D.get("https://opensource-demo.orangehrmlive.com");
		
		String pageTitle = D.getTitle();
		String expectedTitle ="OrangeHRM";
		System.out.println("The Page Title is :" +pageTitle.equals(expectedTitle));
		System.out.println("The page title is a :" +pageTitle);
		System.out.println("The page title lenght is :" +pageTitle.length());
		
		String pageURL = D .getCurrentUrl();
		System.out.println("The page URL is a :" +pageURL);
		String expectedURL ="https://opensource-demo.orangehrmlive.com";
		System.out.println("The page URL is a :" +pageURL.contains(expectedURL));
		
		String sourcecontent = D .getPageSource();
		System.out.println("source content lenght :" +sourcecontent.length());
		
		
        D.findElement(By.name("username")).sendKeys("Admin");
		
		D.findElement(By.name("password")).sendKeys("admin123");
		
		D.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
		
		String homepageurl = D . getCurrentUrl();
		System.out.println("The page URL is a validation :" +homepageurl .contains("dashboard"));
		
		//D .findElement(By.name("txtPassword")).sendKeys("admin123");
		//D.close();
        
		
		
		
	}

}
