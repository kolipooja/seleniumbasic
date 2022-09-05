package Seconddayprograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class Opencrome {

	public static void main(String[] args) {
		
		//ABSOLUTE PATH 
		String driverPath1 = "E:\\Workplace\\Seleniumbasic\\Executables\\chromedriver.exe";
		
		//Relative Path
		String driverPath2 = ".\\Executables\\chromedriver.exe";
		
		//Using System class
		String driverPath3 = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		
		//System.setProperty(string key , string value)
		System.setProperty("webdriver.chrome.driver" , driverPath3);
		
		//create an object 
		
		ChromeDriver cdriver = new ChromeDriver();
		
		
				
		
	}

}

