package Seconddayprograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class opencromedot {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver", 
				".\\Executables\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.google.com");
		cdriver.close();

	}

}

//Using relative path (.)
