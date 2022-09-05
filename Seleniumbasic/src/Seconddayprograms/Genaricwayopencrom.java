package Seconddayprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genaricwayopencrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String currentWorkingdir = System.getProperty("user.dir");
		System.out.println("current working directory " + currentWorkingdir);
		
		String pooja = currentWorkingdir +"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver" , pooja);
		
		WebDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.google.com");
		cdriver.close();


	}

}
