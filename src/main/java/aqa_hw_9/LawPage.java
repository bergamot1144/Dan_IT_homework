package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LawPage {
    private final WebDriver driver;
    private final By lawHeader = By.xpath("//span[contains(@class,'rvts') and normalize-space()='ЗАКОН УКРАЇНИ']");

    public LawPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLawHeaderVisible() {
        return !driver.findElements(lawHeader).isEmpty();
    }
}
