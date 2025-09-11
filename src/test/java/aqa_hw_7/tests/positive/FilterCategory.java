package aqa_hw_7.tests.positive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class FilterCategory {
    @Test
    public void FilterMobile() throws InterruptedException {
        String expectedTitle = "Смартфони і телефони Samsung";

        WebDriver driver = new FirefoxDriver();
        driver.get("https://hotline.ua/mobile/mobilnye-telefony-i-smartfony/");
        BrandSidebarHelper helper = new BrandSidebarHelper(driver);
        helper.clickSamsungInBrandSidebar();
        sleep(7000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("h1.catalog-title__main")
        ));
        String actualText = title.getText().trim();
        Assert.assertTrue(actualText.contains(expectedTitle));
    }
}

