package day12nov23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser2 {
static WebDriver driver = null;
	
	static WebDriver launchBrowser(String brName)
	{
		switch(brName.toUpperCase())
		{
		case "CHROME": 
			driver = new ChromeDriver();
			break;
		case "FIREFOX": 
			driver = new FirefoxDriver();
			break;
		case "EDGE": 
			driver = new EdgeDriver();
			break;
		default:
				System.out.println("Invalid browser name !" + brName);
		}
		return driver;
	}
	
	public static void main(String[] args) 
	{
		driver = LaunchBrowser2.launchBrowser("edge");
		driver.get("https://www.flipkart.com/");
		System.out.println("Title: " + driver.getTitle());
		driver.quit();
	}
}
