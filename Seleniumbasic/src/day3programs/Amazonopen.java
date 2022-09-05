package day3programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonopen {

	public static void main(String[] args) {
		
		String driver = System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver);
		
		ChromeDriver driver23= new ChromeDriver();
		
		driver23.get("https://www.amazon.in");
		
		String pageTitle = driver23.getTitle();
		System.out.println("The title is :"+ pageTitle);
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println("The title validation is :" +pageTitle .equals(expectedTitle));
		System.out.println("The page title lenght is :" +pageTitle.length());
		
		String pageURL = driver23.getCurrentUrl();
		System.out.println("The URL is :" +pageURL);
		String expextedURL ="https://www.amazon.in";
		System.out.println("The URL validation is :" +pageURL.contains(expextedURL));
		
		String sourceconatin = driver23.getPageSource();
		System.out.println("The page source is :" +sourceconatin.length());
		

	}

}
