package day15nov23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListDemo1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();

		WebElement ddl = driver.findElement(By.id("carselect"));
		// HTML DropDown list will always havej <select> tag
		Select select = new Select(ddl);

		select.selectByVisibleText("Honda");
		Thread.sleep(3000l);
		select.selectByVisibleText("Benz");
		Thread.sleep(3000l);
		select.selectByValue("bmw");
		Thread.sleep(3000l);
		select.selectByIndex(2); // Honda

		List<WebElement> low = select.getOptions();
		System.out.println("low.size : " + low.size());

		for (WebElement we : low)
			System.out.println(we.getText());

		System.out.println("Multiple options: " + select.isMultiple());
	}
}
