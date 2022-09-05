package Seconddayprograms;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox1 {

	public static void main(String[] args) {
        
		String currectworkingdir = System.getProperty("user.dir");
		
		System.out.println("current working directory  : "  +currectworkingdir);
		
		String pooja = currectworkingdir + "\\Executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", pooja);
		
		FirefoxDriver fox = new FirefoxDriver();
		
	 fox.get("https://www.google.com");
		fox.close();

	}

}
