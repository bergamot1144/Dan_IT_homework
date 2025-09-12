package aqa_hw_6.explicit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeeDynamicofPriceTest {

    @Test
    public void checkPriceDynamic() {
        String elementToSearch = "Samsung QE65S90D";
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://hotline.ua/");

            WebElement searchField = driver.findElement(By.cssSelector("input"));
            searchField.click();
            searchField.sendKeys(elementToSearch);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector("li.autosuggest__results-item")
            ));

            Assert.assertTrue(
                    "В подсказках не найдено нужное название",
                    suggestion.getText().contains(elementToSearch)
            );

            suggestion.click();

            WebElement priceDynamics = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector("div.mini-price-dynamics__wrapper")
            ));
            priceDynamics.click();

            WebElement expectedElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector("div.modal__title")
            ));
            String actualText = expectedElement.getText().trim();
            Assert.assertEquals("Динаміка цін", actualText);

        } finally {
            driver.quit();
        }
    }
}
