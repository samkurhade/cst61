package day19Dec23;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();

		driver.findElement(By.name("enter-name")).sendKeys("Virat");
		driver.findElement(By.xpath("//input[@value='Alert']")).click();
		Alert alert = driver.switchTo().alert();
		
		System.out.println("AlertText (Alert): " + alert.getText());
		alert.accept();   //oK 
		driver.findElement(By.name("enter-name")).sendKeys("Rohit");
		driver.findElement(By.id("confirmbtn")).click();
		alert = driver.switchTo().alert();
		System.out.println("AlertText(conf): " + alert.getText());
		
		
		
		alert.dismiss();
		

	}
}
