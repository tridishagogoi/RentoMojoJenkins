package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;

public class Category {
	WebDriver driver;

	public Category(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css = "#app > div.application--wrap > main > div > div.view > div > div.rm-category__home > div > div:nth-child(2) > div > ul > li:nth-child(2)")
	WebElement category;

	public void categoryAction() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,200)");
		category.click();

	}
}
