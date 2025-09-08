package aqa_hw_7.tests.positive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class SearchTextAndSwitchLang {

    @Test
    public void searchElementAndSwitchLanguage() throws InterruptedException {
        String element = "Смартфон Apple iPhone 16 Pro Max";
        String expectedString = "По запросу «Смартфон Apple iPhone 16 Pro Max» найдено 284 товара";

        WebDriver driver = new FirefoxDriver();
        driver.get("https://hotline.ua/");
        WebElement searchField = driver.findElement(By.cssSelector("[type='text']"));
        searchField.sendKeys(element, Keys.ENTER);
        sleep(4000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement langButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'lang-button') and normalize-space()='UA']")));
        langButton.click();
        WebElement ruButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='lang-item' and normalize-space()='RU']")));
        ruButton.click();
        WebElement actualString = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.search__title")));
        String actualText = actualString.getText();

        Assert.assertTrue(actualText.contains(expectedString));

        driver.quit();
    }
}
