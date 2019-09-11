package com.liquid.template.selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = "./src/test/resources/features",
        glue = {"com.liquid.template.selenium.steps", "com.liquid.template.selenium.pages"},
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/reports/html/htmlreport",
                "io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm"
        }
)
public class DefaultRunner extends AbstractTestNGCucumberTests {

    @Parameters("browser")
    @BeforeTest
    public static void beforeTest(String browser) {
        WebDriverManager.init(browser);
    }

    @AfterTest
    public static void afterTest() {
        WebDriverManager.shutDownDriver();
    }

}
