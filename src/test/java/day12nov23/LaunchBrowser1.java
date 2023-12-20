package day12nov23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser1 {
static WebDriver driver = null;
	
	static void launchBrowser(String brName)
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
	}
	
	public static void main(String[] args) 
	{
		LaunchBrowser1.launchBrowser("firefox");
		driver.get("https://www.flipkart.com/");
		System.out.println("Title: " + driver.getTitle());
		driver.quit();
	}
}
