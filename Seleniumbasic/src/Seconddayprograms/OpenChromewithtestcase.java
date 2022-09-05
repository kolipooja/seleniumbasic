package Seconddayprograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromewithtestcase {

	public static void main(String[] args) {
		
		String driverpath1 = System.getProperty("user.dir")+ "\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverpath1);
		
		ChromeDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.google.com");
		
		String expectedUrl="https://www.google.com";
		
		String appCurrentUrl=driver1.getCurrentUrl();
		
		System.out.println("Acutal URl:" +appCurrentUrl);
		System.out.println("Expected URL :" +expectedUrl);
		
		if(appCurrentUrl.contains(expectedUrl)) {
			System.out.println("Current URL validation is passed");
		}
		else {
			System.out.println("Current URL validation is Failed");
		}
		
		
		String atualTitle = driver1.getTitle();
		String expectedTitle = "Google";
		System.out.println("Atual Title :" +atualTitle);
		System.out.println("Expected Title :" +expectedTitle);
		
		if(atualTitle.equals(expectedTitle))
		{
			System.out.println("Current Tital validation is passed");
			
		}
		else {
			System.out.println("Current Tital validation is Failed");
			
		}
		
		String sourceContent =driver1.getPageSource();
		System.out.println("Source content length :" + sourceContent.length());
		
			}

}
