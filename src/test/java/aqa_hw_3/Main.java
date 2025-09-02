package aqa_hw_3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Main {

    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new FirefoxDriver();
//        try {
//            String wordToFind = "iPhone";
//
//            driver.get("https://hotline.ua/");
//            driver.manage().window().maximize();
//
//            WebElement searchField = driver.findElement(By.cssSelector("[type='text']"));
//            searchField.sendKeys(wordToFind);
//            sleep(3000);
//
//            WebElement searchButton = driver.findElement(By.cssSelector("[title='Поиск']"));
//            searchButton.click();
//            sleep(7000);
//
//            WebElement titleElement = driver.findElement(By.cssSelector("[class='catalog-title__main']"));
//            String pageTitleString = titleElement.getText();
//
//            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", pageTitleString, wordToFind), pageTitleString.contains(wordToFind));
//        } catch (AssertionError ex) {
//            ex.printStackTrace();
//        } finally {
//            driver.quit();
//        }
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://hotline.ua/");
            WebElement searchFieldLanguage = driver.findElement(By.cssSelector(".lang-button"));
            searchFieldLanguage.click();
            WebElement searchRuButton = driver.findElement(By.xpath("//div[@class='lang-item' and normalize-space()='RU']"));
            searchRuButton.click();
            WebElement textBlock = driver.findElement(By.cssSelector(".search-section__text"));
            String actualText = textBlock.getText().trim();
            String ruText = "2 млн товаров в 2028 магазинах - найди, сравни, выбери свой!";
            Assert.assertEquals(ruText,actualText);
        } catch (AssertionError error)
        {
            error.printStackTrace();
        }
        finally {
            driver.quit();
        }
    }

}
