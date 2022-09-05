package Seconddayprograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Pooja = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", Pooja);
		
		ChromeDriver driver2 = new ChromeDriver();
		
		driver2.get("https://www.flipkart.com");
		
		String pageTitle = driver2.getTitle();
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		System.out.println("Title validation :" +pageTitle.equals(expectedTitle));
		
		
		String pageURL=driver2.getCurrentUrl();
		String expectedURL="https://www.flipkart.com/";
		System.out.println("Page URL validation: "+pageURL.equals(expectedURL));
		
        String sourceContent =driver2.getPageSource();
		System.out.println("Source content length :" + sourceContent.length());
		
	}

}
