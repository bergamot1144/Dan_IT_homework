package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserAgreementPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By titleH1 = By.cssSelector("h1.title-page");
    private final By dispositionLink = By.cssSelector("a[href*='/page/disposition/']");

    public UserAgreementPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(12));
    }

    public String getH1() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(titleH1)).getText().trim();
    }

    public void clickDisposition() {
        wait.until(ExpectedConditions.elementToBeClickable(dispositionLink)).click();
    }
}
