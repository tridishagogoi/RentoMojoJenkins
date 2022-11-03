package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id='top']/div[3]/div/div/div/div[2]/ul[1]/li[2]/button/div")
	WebElement login;

	@FindBy(xpath = "//*[@id='phoneNumberInput']")
	WebElement number;

	@FindBy(xpath = "//*[@id='app']/div[6]/div/div[2]/form/div[2]/button")
	WebElement submit;

	public void loginAction(String num) throws InterruptedException {
		login.click();
		number.sendKeys(num);
		submit.click();
		Thread.sleep(10000);
		submit.click();

	}
}
