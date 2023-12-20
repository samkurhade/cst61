package day19Dec23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisableDemo {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		// check if text bos is enabled or not
		WebElement txtElement = driver.findElement(By.id("enabled-example-input"));
		boolean res = txtElement.isEnabled();
		if(res)
			System.out.println("res if (enable=true)   : " + res); // true
		else
			System.out.println("res else(enable=false) : " + res); // false
		if (res)
			txtElement.sendKeys("Cyber");
		
		//click on disable button 
		driver.findElement(By.id("disabled-button")).click(); // disable
		res = txtElement.isEnabled(); // false
		if (res)
			System.out.println("res if(Enable=true) : " + res); //true
		else
			System.out.println("res if(enable=false): " + res); //false 
		
		//click on enable button
		driver.findElement(By.id("enabled-button")).click();
		res = txtElement.isEnabled();
		if (res)
			System.out.println("res if(Enable=true)  : " + res); //true
		else
			System.out.println("res if(disable=false): " + res); //false 
		txtElement.sendKeys(" Success");
		

		
	}

}
