package day13nov23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.letskodeit.com/practice");
		driver.navigate().to("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("bmwcheck"));
		ele.click();
		 
		ele = driver.findElement(By.id("benzcheck"));
		ele.click();
	 
		ele = driver.findElement(By.id("hondacheck"));
		ele.click();
		
		driver.quit();
		
	}

}
