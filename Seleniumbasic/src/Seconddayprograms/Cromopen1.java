package Seconddayprograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class Cromopen1 {

	public static void main(String[] args) {
        
		String currentWorkingdir = System.getProperty("user.dir");
		System.out.println("current working directory " + currentWorkingdir);
		
		String pooja = currentWorkingdir +"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver" , pooja);
		
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.google.com");
		cdriver.close();
	}

}
