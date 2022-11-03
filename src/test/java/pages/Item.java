package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Item {
	static WebDriver driver;

	public Item(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css = "#app > div.application--wrap > main > div > div.bg-white.view > div:nth-child(2) > div > div > div:nth-child(2) > div > div:nth-child(1)")
	WebElement item;

//	@FindAll({
//			@FindBy(partialLinkText = "https://www.rentomojo.com/public/images/category/package-bg/bedroom-v1_new.jpg"),
//			@FindBy(xpath = "#app > div.application--wrap > main > div > div.bg-white.view > div:nth-child(2) > div > div > div:nth-child(2) > div > div:nth-child(1) > div > img") })
//	WebElement item;

	public void ItemAction() throws InterruptedException {
//      Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		Actions act = new Actions(driver);
		act.moveToElement(item).perform();
		act.click().perform();
		item.click();
	}

}