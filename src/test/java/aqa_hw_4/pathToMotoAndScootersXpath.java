package aqa_hw_4;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class pathToMotoAndScootersXpath {
    @Test
    public void LetsGo()
    {
        WebDriver driver = new FirefoxDriver();
        try {

            driver.get("https://hotline.ua/");
            WebElement autoAndMotoCategory = driver.findElement(By.xpath("//a[@class='categories-section__link link--black' and normalize-space()='Авто і Мото']\n"));
            autoAndMotoCategory.click();
            sleep(2000);
            WebElement motoCategory = driver.findElement(By.xpath("//ul[@class='category-navigation content']//a[@href='/ua/auto/#moto']\n"));
            motoCategory.click();
            sleep(2000);
            WebElement candles = driver.findElement(By.xpath("//div[@class='section-navigation__link-text' and normalize-space()='Свічки запалювання']\n"));
            sleep(2000);
            candles.click();
            sleep(3000);
            WebElement title = driver.findElement(By.xpath("//h1[@class='catalog-title__main' and normalize-space()='Свічки запалення']\n"));
            sleep(4000);
            String actualText = title.getText().trim();
            String expectedText  = title.getText().trim();
            Assert.assertEquals("Заголовок не совпадает!", expectedText, actualText);
        } catch (AssertionError error) {
            error.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            driver.quit();
        }
    }
}
