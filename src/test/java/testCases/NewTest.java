package testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.AddCart;
import pages.Category;
import pages.Item;
import pages.LoginPage;
import pages.Search;
import pages.SelectCity;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class NewTest {
	static WebDriver driver;
	ExtentTest test;
	ExtentReports report;

	@Test
	public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Tridisha\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rentomojo.com");
		driver.manage().window().maximize();

		SelectCity selectCityPg = PageFactory.initElements(driver, SelectCity.class);
		selectCityPg.SelectCityAction();
		test.log(Status.PASS, "Successfully Selected City");

		LoginPage loginPg = PageFactory.initElements(driver, LoginPage.class);
		loginPg.loginAction("7086108456");
		test.log(Status.PASS, "Successfully Logged In");

		Search searchPg = PageFactory.initElements(driver, Search.class);
		searchPg.searchAction("bed");
		Thread.sleep(3000);
		driver.navigate().to("https://www.rentomojo.com");
		test.log(Status.PASS, "Successfully Searched");

		Category categoryPg = PageFactory.initElements(driver, Category.class);
		categoryPg.categoryAction();
		test.log(Status.PASS, "Successfully Selected Category");

		Item itemPg = PageFactory.initElements(driver, Item.class);
		itemPg.ItemAction();
		test.log(Status.PASS, "Successfully Selected Item");

		AddCart addPg = PageFactory.initElements(driver, AddCart.class);
		addPg.addAction();
		test.log(Status.PASS, "Successfully Added And Viewed Cart");

	}

	@BeforeTest
	public void beforeTest() {
		report = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
		report.attachReporter(spark);
		test = report.createTest("ExtentDemo");
	}

	@AfterTest
	public void afterTest() {
		report.flush();

	}

}
