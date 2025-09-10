package aqa_hw_8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;

    @BeforeMethod
    public void initDriver() {
        driver = new FirefoxDriver();
        driver.get("https://hotline.ua");
    }

    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
