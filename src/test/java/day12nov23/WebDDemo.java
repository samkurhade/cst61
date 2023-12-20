package day12nov23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDDemo {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		

		driver.get("https://www.flipkart.com");
		String title = driver.getTitle();
		System.out.println("Title: " + title);

		driver.close();
		// close will close the window where selenium has a focus
		// quit will closes ALL windows opened by driver

	}
}
