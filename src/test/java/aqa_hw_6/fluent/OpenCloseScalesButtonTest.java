package aqa_hw_6.fluent;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;

public class OpenCloseScalesButtonTest {
    @Test
    public void OpenCloseScales() {
        WebDriver driver = new FirefoxDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://hotline.ua/");

            FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(5))
                    .pollingEvery(Duration.ofSeconds(4))
                    .ignoring(IllegalArgumentException.class);

            WebElement scalesButton = driver.findElement(By.cssSelector("[class='popover product-compare'] .button__icon"));
            scalesButton.click();

            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.profile-sidebar__section-content")));

            WebElement closePopup = driver.findElement(By.cssSelector("div.popover-body__close-icon"));
            closePopup.click();

            fluentWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.profile-sidebar__section-content")));

            List<WebElement> heartPopups = driver.findElements(By.cssSelector("div.profile-sidebar__section-content"));

            Assert.assertTrue(heartPopups.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
