package day15nov23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDemo {
	static WebDriver driver = null;

	private static void sendText(By by, String data) {
		driver.findElement(by).sendKeys(data);
	}

	private static void selectListValue(By by, String option) {
		WebElement list = driver.findElement(by);
		Select select = new Select(list);
		select.selectByVisibleText(option);
	}

	private static void selectRadioButton(By by, int ind) {
		List<WebElement> genderList = driver.findElements(by);
		genderList.get(ind).click();
	}

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.linkText("Create new account")).click();

		sendText(By.name("firstname"), "Cyber");
		sendText(By.name("lastname"), "Success");
		sendText(By.name("reg_email__"), "Cyber@gmail.com");
		sendText(By.name("reg_passwd__"), "Cyber@123");

		selectListValue(By.id("day"), "11");
		selectListValue(By.id("month"), "Jan");
		selectListValue(By.id("year"), "1996");

		selectRadioButton(By.name("sex"), 1); // 0 female, 1 male

	}
}
