package Seconddayprograms;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxwithcase {

	public static void main(String[] args) {
        
		String driverpath22 = System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", driverpath22);
		
		FirefoxDriver fox = new FirefoxDriver();
		
		fox.get("https://www.google.com");
		String expectedUrl="https://www.google.com";
		
		String appcurrenturl = fox.getCurrentUrl();
		System.out.println("Atual url :" +appcurrenturl);
		System.out.println("Expected url :" +expectedUrl);
		
		if(appcurrenturl.contains(expectedUrl))
		{
			System.out.println("url same then passed");
		}
		else {
			System.out.println("url not same then failed");
		}
		
		String atualTitle = fox. getTitle();
		String expectedTitle = "Google";
		System.out.println("Atual Title :" +atualTitle );
		System.out.println("Expected Title :" +expectedTitle);
		
		if(atualTitle.equals(expectedTitle))
		{
			System.out.println("Current Tital validation is passed");
			
		}
		else {
			System.out.println("Current Tital validation is Failed");
		}
		
	}

}
