package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForgotPasswordPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By loginInput = By.cssSelector("input[type='text'], input[type='email']");
    private final By sendButton = By.cssSelector("button.reminder-form__button");
    private final By errorBlock = By.cssSelector("div.error.m_b-5");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void typeLogin(String value) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(loginInput));
        input.clear();
        input.sendKeys(value);
    }

    public void clickSendButton() {
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(sendButton));
        btn.click();
    }

    public boolean isErrorVisible() {
        return !driver.findElements(errorBlock).isEmpty();
    }

    public String getErrorText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorBlock)).getText().trim();
    }
}
