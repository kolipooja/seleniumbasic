package Seconddayprograms;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Openfirefox {

	public static void main(String[] args) {
		 
		String driverpath1 = "E:\\Workplace\\Seleniumbasic\\Executables\\geckodriver.exe";
		
		String driverpath2 = ".\\Executables\\geckodriver.exe";
		
		String driverpath3 = System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver" , driverpath3);
		
		FirefoxDriver pooja = new FirefoxDriver();

	}

}
