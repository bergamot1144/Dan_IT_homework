package aqa_hw_3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangeLangTest {
    @Test
    public void TestSwitchLangButton() {
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://hotline.ua/");
            WebElement searchFieldLanguage = driver.findElement(By.cssSelector(".lang-button"));
            searchFieldLanguage.click();
            WebElement searchRuButton = driver.findElement(By.xpath("//div[@class='lang-item' and normalize-space()='RU']"));
            searchRuButton.click();
            WebElement textBlock = driver.findElement(By.cssSelector(".search-section__text"));
            String actualText = textBlock.getText().trim();
            Assert.assertTrue("Text does not contain text what I need'",
                    actualText.contains("найди, сравни, выбери свой!"));
        } finally {
            driver.quit();
        }
    }
}
