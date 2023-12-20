package day15nov23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectGenericMethod {
	static void mySelection(Select select, String... arrList) {
		if (arrList[0].equals("ALLOPTIONS")) {
			for (WebElement we : select.getOptions())
				select.selectByVisibleText(we.getText());
		} else {
			for (String str : arrList)
				select.selectByVisibleText(str);
		}
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement mddl = driver.findElement(By.id("multiple-select-example"));
		Select select = new Select(mddl);

		// mySelection(select, "ALLOPTIONS");
		mySelection(select, "Orange");

	}
}
