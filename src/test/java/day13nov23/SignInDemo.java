package day13nov23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();

//		driver.findElement(By.linkText("SIGN IN")).click();
		driver.findElement(By.partialLinkText("SIGN")).click();

	}
}
