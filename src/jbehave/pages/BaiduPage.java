package jbehave.pages;

import jbehave.base.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 
 * 
 * @author Kane.Sun
 * @version Feb 19, 2014 11:16:25 AM
 * 
 */

public class BaiduPage extends BasePage {

	public void nevigateToHomePage() {
		helper.openURL("/");
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void searchSpecificTextOnPage() {
		WebElement searchField = helper.findElmenetBy(By.id("kw"));
		WebElement searchButton = helper.findElmenetBy(By.id("su"));
		helper.typeText("三中姐", searchField);
		helper.clickOn(searchButton);
	}

	public boolean isExpectedResultShowUp() {
		WebElement searchField = helper.findElmenetBy(By.id("kw"));
		// here we could define a final string as sanzhongjie .
		return searchField.getAttribute("value").equals("三中姐");
	}

	public void reandomlyNevigateResultLink() {
		WebElement firstLink = helper.findElmenetBy(By.cssSelector("content_left"));
		helper.clickOn(firstLink);
	}
}
