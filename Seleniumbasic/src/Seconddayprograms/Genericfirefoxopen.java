package Seconddayprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Genericfirefoxopen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String currectworkingdir = System.getProperty("user.dir");
		
		System.out.println("current working directory  : "  +currectworkingdir);
		
		String pooja = currectworkingdir + "\\Executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", pooja);
		
		WebDriver fox = new FirefoxDriver();
		
	 fox.get("https://www.google.com");
		fox.close();

		
	}
	

}
