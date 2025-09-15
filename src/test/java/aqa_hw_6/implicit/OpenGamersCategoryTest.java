package aqa_hw_6.implicit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;

public class OpenGamersCategoryTest {
    @Test
    public void openGamersButton() {
        WebDriver driver = new FirefoxDriver();
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
            driver.get("https://hotline.ua/");

            WebElement goodsForGamers = driver.findElement(By.cssSelector("a.categories-section__link[href='/ua/computer/sredstva-multimedia/']"));
            goodsForGamers.click();

            WebElement title = driver.findElement(
                    By.cssSelector("h1.title-page.section-title")
            );
            Assert.assertTrue(title.getText().contains("Товари для геймерів"));

        } finally {
            driver.quit();
        }
    }
}
