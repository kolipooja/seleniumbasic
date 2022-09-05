package day3programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tricentisopen {

	public static void main(String[] args) {
		
		String ritesh = System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ritesh);
		
		ChromeDriver D1 = new ChromeDriver();
		
		D1.get("http://sampleapp.tricentis.com/101");
		
		String pageTitle = D1.getTitle();
		System.out.println("The title is :"+ pageTitle);
		String expectedTitle="Tricentis Vehicle Insurance";
		System.out.println("The title validation is :" +pageTitle .equals(expectedTitle));
		System.out.println("The page title lenght is :" +pageTitle.length());
		
		String pageURL = D1.getCurrentUrl();
		System.out.println("The URL is :" +pageURL);
		String expextedURL ="http://sampleapp.tricentis.com/101";
		System.out.println("The URL validation is :" +pageURL.contains(expextedURL));
		
		String sourceconatin = D1.getPageSource();
		System.out.println("The page source is :" +sourceconatin.length());
		
		
			}

}
