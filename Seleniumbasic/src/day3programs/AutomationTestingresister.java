package day3programs;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestingresister {

	public static void main(String[] args) {
       
		String pooja = System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pooja);
		
		ChromeDriver driver1 = new ChromeDriver();
		
		driver1.get("https://demo.automationtesting.in/Register.html");
		
		String pageTitle = driver1 .getTitle();
		String expectedTitle = "Register";
		System.out.println("The pageTiitle is validate :" +pageTitle.equals(expectedTitle));
		System.out.println("The pageTitle is a :" +pageTitle);
		System.out.println("The pageTitle is a :" +pageTitle.length());
		
		String pageURL = driver1 .getCurrentUrl();
		System.out.println("The page URL is a :" +pageURL);
		String expectedURL ="https://demo.automationtesting.in/Register.html";
		System.out.println("The PageURL validation :" + pageURL .contains(expectedURL) );
		
		String sourcescontain = driver1 .getPageSource();
		System.out.println("The Sources Page Contain is :" + sourcescontain.length());
		
		
		
		
	}

}
