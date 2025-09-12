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

import static java.lang.Thread.sleep;

public class SeeDynamicofPriceTest {

    @Test
    public void checkPriceDynamic() throws InterruptedException {
        String TV = "Samsung QE65S90D";
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://hotline.ua/");
            WebElement searchField = driver.findElement(By.cssSelector("input"));
            searchField.click();
            searchField.sendKeys(TV);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement sliderTVcontainer = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//li[contains(@class,'autosuggest__results-item')][contains(normalize-space(),'OLED телевізор Samsung QE65S90D')]")
                    )
            );
            sliderTVcontainer.click();
            WebElement priceDynamics = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.mini-price-dynamics__wrapper")));
            priceDynamics.click();
            WebElement expectedElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.modal__title")));
            String actualText = expectedElement.getText().trim();
            Assert.assertEquals("Динаміка цін", actualText);
        } catch (AssertionError error) {
            error.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}
