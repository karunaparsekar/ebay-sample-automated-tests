package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EbayCommonActions {

	public void selectOptionByVisibleText(String visibleText, WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
}
