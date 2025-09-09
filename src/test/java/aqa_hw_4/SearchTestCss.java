package aqa_hw_4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class SearchTestCss {
    @Test
    public void tryToSearchIphone() {
        String wordToFind = "iPhone";
        WebDriver driver = new FirefoxDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://hotline.ua/");
            WebElement searchField = driver.findElement(By.cssSelector("input[type='text']"));
            searchField.sendKeys(wordToFind, Keys.ENTER);
            sleep(7000);
            WebElement searchTitle = driver.findElement(By.cssSelector("div.search__title"));
            sleep(3000);
            String actualTitleText = searchTitle.getText();
            Assert.assertTrue(actualTitleText.contains(wordToFind));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}