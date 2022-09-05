package openbroswsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class opencrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Workplace\\Seleniumbasic\\Executables\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.google.com");
		cdriver.close();

	}

}
