package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EbayAdvanceSearchElements {

	WebDriver driver;

	@FindBy(linkText = "Advanced")
	public WebElement advanceSearchLink;

	@FindBy(xpath = "//input[@id='_nkw']")
	public WebElement keyword;

	@FindBy(id = "s0-1-17-4[0]-7[1]-_in_kw")
	public WebElement keywordOptions;

	@FindBy(xpath = "_ex_kw")
	public WebElement exclude;

	@FindBy(id = "s0-1-17-4[0]-7[3]-_sacat")
	public WebElement category;

	public EbayAdvanceSearchElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

}
