package com.liquid.template.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class WebDriverManager {

    private static WebDriver driver;

    public static void init(String browser) {
        buildDriver(browser);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    private static void buildDriver(String browser) {
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }
    }

    public static void shutDownDriver() {
        driver.quit();
    }

}
