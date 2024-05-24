package actions;

import org.openqa.selenium.WebDriver;

import elements.EbayAdvanceSearchElements;

import stepdef.CommonSteps;

public class EbayAdvanceSearchActions {

	WebDriver driver;
	EbayAdvanceSearchElements ebayAdvanceSearchElementsRef;
	EbayCommonActions ebayCommonActions = new EbayCommonActions();

	public EbayAdvanceSearchActions(CommonSteps commonsteps) {
		this.driver = commonsteps.getDriver();
		ebayAdvanceSearchElementsRef = new EbayAdvanceSearchElements(driver);

	}

	public void clickAdvancedLink() {
		ebayAdvanceSearchElementsRef.advanceSearchLink.click();
	}

	public void advanceSearchKeywords(String keyword) {
		ebayAdvanceSearchElementsRef.keyword.sendKeys(keyword);

	}

	public void advanceSearchKeywordsOptions(String keywordOptions) {

		ebayCommonActions.selectOptionByVisibleText(keywordOptions, ebayAdvanceSearchElementsRef.keywordOptions);

	}

	public void advanceSearchExclude(String exclude) {
		ebayAdvanceSearchElementsRef.exclude.sendKeys(exclude);

	}

	public void advanceSearchCategory(String category) {
		ebayCommonActions.selectOptionByVisibleText(category, ebayAdvanceSearchElementsRef.category);

	}

}
