package aqa_hw_4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TranslaterTestXpath {
    @Test
    public void traslateButtonTest() {
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://hotline.ua/");
            WebElement langButton = driver.findElement(
                    By.xpath("//div[contains(@class,'lang-button') and normalize-space()='UA']"));
            langButton.click();
            WebElement ruButton = driver.findElement(
                    By.xpath("//div[@class='lang-item' and normalize-space()='RU']"));
            ruButton.click();
            WebElement textBlock = driver.findElement(
                    By.xpath("//div[@class='search-section__text']"));
            String actualText = textBlock.getText().trim();
            String expectedText = "выбери свой";
            Assert.assertTrue(actualText.contains(expectedText));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }


}
