package aqa_hw_4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class FastEnterSearchTestCss {
    @Test
    public void FastEnterTest() throws InterruptedException {
        String wordToFind = "Смартфон Apple iPhone 14";
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://hotline.ua/");
            WebElement searchField = driver.findElement(By.cssSelector("input[type='text']"));
            searchField.sendKeys(wordToFind, Keys.ENTER);
            sleep(5000);
            WebElement searchTitle = driver.findElement(By.cssSelector("div.search__title"));
            String actualTitleText = searchTitle.getText();
            Assert.assertTrue(actualTitleText.contains("За запитом"));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            driver.quit();
        }

    }
}
