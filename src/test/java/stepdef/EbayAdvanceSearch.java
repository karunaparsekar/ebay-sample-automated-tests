package stepdef;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class EbayAdvanceSearch {
	String browser = "chrome";
	WebDriver driver = null;
	Select select;

	public EbayAdvanceSearch(CommonSteps commonsteps) {

		this.driver = commonsteps.getDriver();
	}

	@Given("User is on ebay home page")
	public void user_is_on_ebay_home_page() {

		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@When("User clicks on Advance search link")
	public void user_clicks_on_advance_search_link() {
		driver.findElement(By.linkText("Advanced")).click();

	}

	@When("User navigates to Advance search page")
	public void user_navigates_to_advance_search_page() {
		if (driver.getCurrentUrl().equals("https://www.ebay.com/sch/ebayadvsearch")) {
			System.out.println("test pass");
		}

	}

	@When("User clicks on shop by category")
	public void user_clicks_on_shop_by_category() {
		driver.findElement(By.xpath("//*[ text() =' Shop by category']")).click();

	}

	@When("User clicks on {string}")
	public void user_clics_on(String string) throws InterruptedException {

		WebElement element = driver.findElement(By.linkText(string));
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", element);

	}

	@Then("Validate that page navigates to {string} and title contains {string}")
	public void validate_that_page_navigates_to_and_title_contains(String url, String title) {
		System.out.println(driver.getCurrentUrl().equals(url) + " &" + "actual" + driver.getTitle() + " expected "
				+ title + driver.getTitle().contains(title));

		Assert.assertTrue((driver.getCurrentUrl().equals(url) & driver.getTitle().contains(title)));

	}

	@When("User enters below data to get required serach result")
	public void user_enters_below_data_to_get_required_serach_result(DataTable datatable) throws InterruptedException {
		List<Map<String, String>> rows = datatable.asMaps(String.class, String.class);
		for (Map<String, String> columns : rows) {
			// System.out.println(columns.get("keyword")+ columns.get("keywordOptions")
			// +columns.get("exclude")+ columns.get("category"));

			driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(columns.get("keyword"));
			select = new Select(driver.findElement(By.xpath("//*[@id=\"s0-1-17-4[0]-7[1]-_in_kw\"]")));
			select.selectByVisibleText(columns.get("keywordOptions"));
			driver.findElement(By.xpath("//*[@id=\"_ex_kw\"]")).sendKeys(columns.get("exclude"));
			select = new Select(driver.findElement(By.xpath("//*[@id=\"s0-1-17-4[0]-7[3]-_sacat\"]")));
			select.selectByVisibleText(columns.get("category"));
			driver.findElement(By.xpath("//button[text()='Search']")).click();
			Thread.sleep(1500);
			driver.navigate().back();
		}
	}

}
