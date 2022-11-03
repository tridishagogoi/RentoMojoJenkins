package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;

public class AddCart {
	WebDriver driver;

	public AddCart(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css = "#app > div.application--wrap > main > div > div.bg-white.view > div:nth-child(2) > div > div > div.col-md-9 > div.cat-items > div.row.row-flexed > div:nth-child(3) > a > div > div.cat-item--img")
	WebElement obj;

	@FindBy(css = "#app > div.application--wrap > main > div > div.bg-white.view > div:nth-child(2) > div > div > div.col-md-9 > div.cat-items > div.row.row-flexed > div:nth-child(3) > a > div > div.pa-3 > div.rm-quickview__container")
	WebElement selected;

	@FindBy(css = "#app > div.dialog__content.dialog__content__active > div > div.dialog-content > div > div.col-md-6.rm-product__details > div > div.rm-buttons > div > button")
	WebElement added;

	@FindBy(css = "#app > div.dialog__content.dialog__content__active > div > div.dialog-content > div > div.col-md-6.rm-product__details > div > div.rm-buttons > div > a")
	WebElement view;

	public void addAction() throws InterruptedException {
		Actions act = new Actions(driver);
//	        Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		act.moveToElement(obj).perform();
		selected.click();
		added.click();
//	        Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		view.click();

	}
}
