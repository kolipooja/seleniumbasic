package openbroswsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class openfirefox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Workplace\\Seleniumbasic\\Executables\\geckodriver.exe");
		FirefoxDriver pooja = new FirefoxDriver();
		
		pooja.get("https://www.google.com");
		pooja.close();
		
		
	}

}
