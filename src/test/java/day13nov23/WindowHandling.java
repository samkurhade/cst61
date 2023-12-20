package day13nov23;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();

		String windID = driver.getWindowHandle();
		System.out.println("windId : " + windID);
		driver.findElement(By.id("openwindow")).click();
		Set<String> windIds = driver.getWindowHandles();
		System.out.println(windIds.size()); // 2

		Iterator<String> iter = windIds.iterator();
		String pWindId = iter.next();
		String cWindId = iter.next();

		driver.switchTo().window(cWindId);
		String childUrl = driver.getCurrentUrl();
		System.out.println("childUrl: " + childUrl);
		/*
		 * Thread.sleep(2000l); driver.close();
		 * 
		 * driver.switchTo().window(pWindId); Thread.sleep(2000l);
		 * 
		 * driver.close();
		 */
		driver.quit();

	}
}
