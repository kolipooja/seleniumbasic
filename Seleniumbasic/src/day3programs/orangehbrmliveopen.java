package day3programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class orangehbrmliveopen {

	public static void main(String[] args) {
		
		String driver1 = System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver1);
		
		ChromeDriver driver22 = new ChromeDriver();
		
		driver22.get("https://opensource-demo.orangehrmlive.com");
		
		String pageTitle = driver22 .getTitle();
		String expectedTitle ="OrangeHRM";
		System.out.println("The Page Title is :" +pageTitle.equals(expectedTitle));
		System.out.println("The page title is a :" +pageTitle);
		System.out.println("The page title lenght is :" +pageTitle.length());
		
		String pageURL = driver22 .getCurrentUrl();
		System.out.println("The page URL is a :" +pageURL);
		String expectedURL ="https://opensource-demo.orangehrmlive.com";
		System.out.println("The page URL is a :" +pageURL.contains(expectedURL));
		
		String sourcecontent = driver22 .getPageSource();
		System.out.println("source content lenght :" +sourcecontent.length());
		
	}

}
