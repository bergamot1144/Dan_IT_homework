package aqa_hw_4;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class scrollingTestXpath {
    @Test
    public void scrolling()
    {
        WebDriver driver = new FirefoxDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://hotline.ua/");
            WebElement autoAndMotoCategory = driver.findElement(By.xpath("//a[@class='categories-section__link link--black' and normalize-space()='Авто і Мото']\n"));
            autoAndMotoCategory.click();
            sleep(2000);
            WebElement motoCategory = driver.findElement(By.xpath("//ul[@class='category-navigation content']//a[@href='/ua/auto/#moto']\n"));
            motoCategory.click();
            sleep(2000);
            WebElement motoLink = driver.findElement(By.xpath("//a[@href='/ua/auto/moto/' and normalize-space()='Мотоцикли, скутери']"));
            Assert.assertTrue("Ссылка не кликается", motoLink.isEnabled());
        } catch (AssertionError error) {
           error.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            driver.quit();
        }

    }
}
