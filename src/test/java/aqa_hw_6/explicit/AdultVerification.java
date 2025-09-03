package aqa_hw_6.explicit;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class AdultVerification {
    @Test
    public void adultVerificationTest() {
        String expectedText = "Для перегляду товарів в цьому розділі каталогу Hotline.ua підтвердіть, що Ви старше 18 років";
        WebDriver driver = new FirefoxDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://hotline.ua/");

            WebElement adultCategory =
                    driver.findElement(By.cssSelector("a.categories-section__link[data-eventlabel='Товари для дорослих']"));
            adultCategory.click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement beerCider = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='section-navigation__link-text' and normalize-space()='Пиво, сидр']")));
            beerCider.click();

            WebElement adultModal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.adult__info")));
            String actualText = adultModal.getText().trim();

            Assert.assertEquals("Текст не совпал", expectedText, actualText);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}



