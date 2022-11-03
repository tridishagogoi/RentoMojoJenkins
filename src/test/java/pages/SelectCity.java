package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectCity {
	WebDriver driver;

	public SelectCity(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id='citySelector']/li[1]")

	WebElement city;

	public void SelectCityAction() {

		city.click();
	}

}
