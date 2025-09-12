package aqa_hw_10;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Configuration.browser;

@Listeners({AllureTestNg.class})
public class BaseTest {
    @BeforeMethod
    public void initDriver() {
        browser = "firefox";
        Selenide.open("https://booklion.lviv.ua/");
    }

    @AfterMethod
    public void quitDriver() {
        Selenide.closeWebDriver();
    }
}
