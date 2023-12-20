package day13nov23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemoUsingLOW {
	static void webElementClick(WebDriver dr, By b) {
		dr.findElement(b).click();
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();

		webElementClick(driver, By.id("bmwcheck"));
		webElementClick(driver, By.id("benzcheck"));
		webElementClick(driver, By.id("hondacheck"));

	}
}
