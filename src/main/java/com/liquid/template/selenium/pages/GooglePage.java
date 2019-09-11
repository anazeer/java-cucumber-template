package com.liquid.template.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class GooglePage extends Page {

    @FindBy(name = "q")
    private WebElement searchBar;

    @FindBy(name = "btnK")
    private WebElement runSearchButton;

    @FindBy(className = "ellip")
    private List<WebElement> searchResults;

    public void navigate() {
        driver.get("https://google.fr");
    }

    public void searchFor(String search) {
        wait.until(visibilityOf(searchBar));
        searchBar.sendKeys(search);
    }

    public void runSearch() {
        wait.until(visibilityOf(runSearchButton));
        runSearchButton.click();
    }

    public String getFirstResultName() {
        wait.until(visibilityOf(searchResults.get(0)));
        return searchResults.get(0).getText();
    }

}
