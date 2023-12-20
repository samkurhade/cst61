package day19Dec23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HideShowDemo {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("displayed-text"));
		
		boolean res = element.isDisplayed();
		if (res)
			System.out.println("res(displayed) : " + res);
		else
			System.out.println("res(!displayed) : " + res);
		element.sendKeys("Cyber"," Success");	
		WebElement hideTxtBtn = driver.findElement(By.id("hide-textbox"));
		hideTxtBtn.click();
		res = element.isDisplayed(); // false
		System.out.println("res false: " + res);
		
		driver.findElement(By.id("show-textbox")).click();
		res = element.isDisplayed(); // true
		System.out.println("res true: " + res);
		element.clear();
		element.sendKeys("Training");
		
		
		
	}

}
