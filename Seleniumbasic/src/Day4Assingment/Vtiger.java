package Day4Assingment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		// click on signin button
		driver.findElement(By.cssSelector(".buttonBlue")).click();
		
		driver.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();
		
		driver.findElement(By.cssSelector("a[data-name='CalendarActivities']")).click();
		
		// click on Widget button
		driver.findElement(By.cssSelector(".addButton")).click();
		
		driver.findElement(By.cssSelector("a[data-name='GroupedBySalesPerson']")).click();
		
		driver.findElement(By.cssSelector(".addButton")).click();
		
		driver.findElement(By.cssSelector("a[data-name='LeadsByStatus']")).click();
		
		driver.findElement(By.cssSelector(".userName ")).click();
		
		driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
		
	}
}