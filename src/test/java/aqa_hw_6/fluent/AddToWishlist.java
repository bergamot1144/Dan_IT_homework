package aqa_hw_6.fluent;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class AddToWishlist {

    @Test
    public void wishListTest() throws InterruptedException {
        String TV = "Samsung QE65S90D";

        WebDriver driver = new FirefoxDriver();
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500));
        try {
            driver.manage().window().maximize();
            driver.get("https://hotline.ua/");
            WebElement searchField = wait.until(
                    ExpectedConditions.elementToBeClickable(By.cssSelector("input"))
            );
            searchField.sendKeys(TV);
            WebElement suggestion = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//li[contains(@class,'autosuggest__results-item')][contains(.,'OLED телевізор Samsung QE65S90D')]")
                    )
            );
            suggestion.click();
            WebElement addToWishlist = wait.until(
                    ExpectedConditions.elementToBeClickable(By.cssSelector("div.action-button.action-button--bookmark"))
            );
            addToWishlist.click();
            WebElement chooseWishlist = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.cssSelector("div.modal__body a[href*='/lists/bookmarks/']")
                    )
            );
            chooseWishlist.click();
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }
            WebElement header = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.profile-page-title"))
            );
            String headerText = header.getText().trim();

            Assert.assertEquals("Хочу: 1", headerText);

        } finally {
            driver.quit();
        }
    }
}
