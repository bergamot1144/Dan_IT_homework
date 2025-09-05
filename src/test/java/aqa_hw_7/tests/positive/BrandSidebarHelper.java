package aqa_hw_7.tests.positive;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrandSidebarHelper {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public BrandSidebarHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void clickSamsungInBrandSidebar() {
        By brandSidebar = By.xpath(
                "//div[contains(@class,'sidebar-filter__header-title')]//b[normalize-space()='Бренд']" +
                        "/ancestor::div[contains(@class,'sidebar-filter')]"
        );
        WebElement sidebar = wait.until(ExpectedConditions.visibilityOfElementLocated(brandSidebar));


        By body = By.xpath(".//div[contains(@class,'sidebar-filter__body')]");
        WebElement bodyEl = sidebar.findElement(body);
        wait.until(ExpectedConditions.visibilityOf(bodyEl));


        By samsungLink = By.xpath(
                ".//a[contains(@class,'filter-checklist__item-name')]" +
                        "[span[normalize-space()='Samsung']]"
        );
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(sidebar.findElement(samsungLink)));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", link);
        link.click();
    }
}
