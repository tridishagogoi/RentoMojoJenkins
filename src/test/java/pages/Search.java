package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Search {
	static WebDriver driver;

	public Search(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(className = "form-control")
	WebElement search;

	public void searchAction(String furn) throws InterruptedException {
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		act.click(search).build().perform();
		search.sendKeys(furn);
		act.sendKeys(Keys.ENTER).build().perform();

	}
}
