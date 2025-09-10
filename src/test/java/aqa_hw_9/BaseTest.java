package aqa_hw_9;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Configuration.*;

public class BaseTest {
    @BeforeMethod
    public void initDriver() {

        browser = "firefox";
        Selenide.open("https://hotline.ua");
    }
    @AfterMethod
    public void quitDriver() {
        Selenide.closeWebDriver();
    }
}
