package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private final By loginField = By.cssSelector("[inputmode='email']");
    private final By passwordField = By.cssSelector("[type='password']");
    private final By dispositionLink = By.cssSelector("a[href='/ua/page/disposition/']");
    private final By loginButton = By.cssSelector("[type='submit']");
    private final By forgetPasswordLink = By.cssSelector("a[href='/ua/reminder/']");
    private final By userAgreementLink = By.cssSelector("a[href='/ua/page/user_agreement/'], a[href='/page/user_agreement/']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUserAgreement() {
        driver.findElement(userAgreementLink).click();
    }

    public void clickForgetPassword() {
        driver.findElement(forgetPasswordLink).click();
    }

    public void switchToNewTab() {
        String originalWindow = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }

}
