package com.liquid.template.selenium.pages;

import com.liquid.template.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    protected WebDriver driver;
    protected WebDriverWait wait;

    Page() {
        driver = WebDriverManager.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 5);
    }

}
