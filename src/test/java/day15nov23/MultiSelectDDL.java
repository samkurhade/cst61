package day15nov23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDDL {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();

		WebElement mddl = driver.findElement(By.id("multiple-select-example"));
		Select select = new Select(mddl);

		System.out.println("multi Select: " + select.isMultiple()); // true
		List<WebElement> low = select.getOptions();
		System.out.println(low.size());
		for (WebElement we : low)
			System.out.println(we.getText());

		/*
		 * select.selectByIndex(0); select.selectByIndex(2);
		 */
		select.selectByValue("orange");
		select.selectByVisibleText("Apple");

		System.out.println("Selected options from a list: ");
		low = select.getAllSelectedOptions(); // Orange and Apple
		for (WebElement we : low)
			System.out.println(we.getText());

		// select.deselectAll();

		select.deselectByVisibleText("Orange");
		Thread.sleep(3000l);
		select.deselectByVisibleText("Orange");
	}
}
