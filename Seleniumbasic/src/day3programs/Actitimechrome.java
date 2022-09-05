package day3programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimechrome {

	public static void main(String[] args) {
         
		String driver18 = System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driver18);
		
		ChromeDriver driver1 = new ChromeDriver();
		
		driver1.get("https://demo.actitime.com");
		
		String pageTitle = driver1.getTitle();
		String expectedTitle="actiTIME - Login";
		System.out.println("The page title is :" +pageTitle.equals(expectedTitle));
		System.out.println("The page Title :" +pageTitle);
		System.out.println("The page Title lenght :" +pageTitle.length());
		
	
		
		String sourceContent = driver1 .getPageSource();
		System.out.println("Source Content Lenght :" +sourceContent.length());
		
		String PageURL = driver1 .getCurrentUrl();
		System.out.println("Page URL is a :" +PageURL);
		String expectedURL ="https://demo.actitime.com";
		System.out.println("Page URL validation :" + PageURL .contains(expectedURL));
		
		
		
	}

}
