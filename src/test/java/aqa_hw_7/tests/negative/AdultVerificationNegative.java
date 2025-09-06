package aqa_hw_7.tests.negative;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class AdultVerificationNegative {

    private WebDriver driver;
    private WebDriverWait wait;

    private final String BASE_URL = "https://hotline.ua/";
    private final String EXPECTED_MODAL_TEXT =
            "Для перегляду товарів в цьому розділі каталогу Hotline.ua підтвердіть, що Ви старше 18 років";

    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) driver.quit();
    }

    private void openAdultCategoryBeerCider() {
        By adultCategory = By.cssSelector("a.categories-section__link[data-eventlabel='Товари для дорослих']");
        wait.until(ExpectedConditions.elementToBeClickable(adultCategory)).click();

        By beerCider = By.xpath("//div[@class='section-navigation__link-text' and normalize-space()='Пиво, сидр']");
        wait.until(ExpectedConditions.elementToBeClickable(beerCider)).click();
    }

    private void assertAdultModalAppears() {
        By modalText = By.cssSelector("span.adult__info");
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(modalText));
        String actualText = modal.getText().trim();

        Assert.assertEquals(
                actualText,
                EXPECTED_MODAL_TEXT,
                "Текст модального окна 18+ не совпал с ожидаемым"
        );
    }
    @Test
    public void under18TwiceShowsModalAgain() {
        openAdultCategoryBeerCider();
        assertAdultModalAppears();
        By under18Btn = By.xpath("//button[normalize-space()='Мені ще немає 18 років']");
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(under18Btn));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", btn);
        btn.click();

        wait.until(ExpectedConditions.urlToBe(BASE_URL));
        openAdultCategoryBeerCider();

        assertAdultModalAppears();
    }
}
