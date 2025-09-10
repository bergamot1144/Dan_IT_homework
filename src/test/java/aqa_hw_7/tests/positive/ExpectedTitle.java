package aqa_hw_7.tests.positive;

import aqa_hw_7.data_provider.ProvideData;
import aqa_hw_7.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class ExpectedTitle extends BaseTest {
    @Test(dataProvider = "getSearchData", dataProviderClass = ProvideData.class)

    public void verifySearchResults(String searchQuery) throws InterruptedException {
        WebElement searchField = getDriver().findElement(By.cssSelector("[type='text']"));
        searchField.sendKeys(searchQuery);
        sleep(1000);
        searchField.sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        sleep(4000);
        WebElement langButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'lang-button') and normalize-space()='UA']")));
        langButton.click();
        WebElement ruButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='lang-item' and normalize-space()='RU']")));
        ruButton.click();
        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.catalog-title__main")));
        String expected = getExpectedTitle(searchQuery);
        Assert.assertEquals(title.getText().trim(), expected,
                "Заголовок не совпадает!");
    }
    private String getExpectedTitle(String query) {
        switch (query.toLowerCase()) {
            case "xbox": return "Игровые приставки Microsoft";
            case "samsung": return "Samsung";
            case "iphone": return "Apple iPhone (Айфоны)";
            default: throw new IllegalArgumentException("Неизвестный запрос: " + query);
        }
    }
}
