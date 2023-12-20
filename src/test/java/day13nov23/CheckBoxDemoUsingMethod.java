package day13nov23;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemoUsingMethod {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();

		List<WebElement> low = driver.findElements(By.xpath("//input[@type='checkbox' and @name='cars']"));
		System.out.println("no of checkboxes: " + low.size()); // 3
		/*
		 * for (WebElement we : low) { we.click(); Thread.sleep(2000l); }
		 */
		/*
		 * for(int i =0; i<low.size();i++) { low.get(i).click(); Thread.sleep(2000l); }
		 */
		Random rnd = new Random();
		int ind = rnd.nextInt(0, 3);
		low.get(ind).click();
		Thread.sleep(2000l);
		for (WebElement we : low) {
			Thread.sleep(2000l);
			if (we.isSelected()) // isSelected checks whether the checbox is selected/checked
				we.click();
		}
	}
}
