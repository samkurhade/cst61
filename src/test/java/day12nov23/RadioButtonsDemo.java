package day12nov23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsDemo {
	public static void main(String[] args) throws InterruptedException {
 		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
	/* driver is of type WebDriver
		manage is a method from WebDriver interface 
		manage() returns options class and window() is its method
		window() returns Window class and has maximize() method
		maximize() does not return anything(void) 
	*/		
/*		Date dt = new Date();
		System.out.println(dt.toString());
		System.out.println(dt.toString().replace(" ", "_").replace(":", "_"));
*/		
		
/*		WebElement bmwRB   = driver.findElement(By.id("bmwradio"));
		WebElement benzRB  = driver.findElement(By.id("benzradio"));
		WebElement hondaRB = driver.findElement(By.id("hondaradio"));

		bmwRB.click(); Thread.sleep(2000l);
		benzRB.click();Thread.sleep(2000l);
		hondaRB.click();
*/
		List<WebElement> low = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("low.size() : " + low.size()); // 3
		
/*		low.get(0).click(); Thread.sleep(2000l);
		low.get(1).click();Thread.sleep(2000l);
		low.get(2).click();
*/
		/*for (WebElement we : low) {
			we.click(); Thread.sleep(1000l);
		}
		*/
		for(int i=low.size()-1;i>=0;i--)
		{
			/*WebElement we = low.get(i);
			we.click(); */
			low.get(i).click();
			Thread.sleep(1000l);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
