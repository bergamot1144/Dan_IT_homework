package aqa_hw_4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class GetGiftTestCss {
    @Test
    public void tryToSearchIphone() {
        String wordToFind = "iPhone";
        WebDriver driver = new FirefoxDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://hotline.ua/");
            WebElement bonusButton = driver.findElement(By.cssSelector("a[href='/ua/loyalty/']"));
            bonusButton.click();
            sleep(3000);
            WebElement giftImg = driver.findElement(By.cssSelector("img[alt='gift']"));
            giftImg.click();
            sleep(3000);
            WebElement exchangeOrangeButton = driver.findElement(By.cssSelector("button.exchange-modal__btn.btn--orange"));
            exchangeOrangeButton.click();
            sleep(5000);
            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.equals("https://hotline.ua/ua/login/"),"Ошибка!!! Перешли по ссылке " + currentUrl);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}