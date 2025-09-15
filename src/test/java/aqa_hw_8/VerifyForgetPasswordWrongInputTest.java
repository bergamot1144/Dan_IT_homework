package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerifyForgetPasswordWrongInputTest extends BaseTest {

    @Test
    public void verifySearchWorkingCorrectly() {
        HomePage home = new HomePage(getDriver());
        home.goToLoginPage();

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement forgetPasswordLink = wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/ua/reminder/']"))
        );
        forgetPasswordLink.click();

        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(getDriver());
        forgotPasswordPage.typeLogin("qwerty!@#not-an-email");
        forgotPasswordPage.clickSendButton();

        String expected = "Введіть email або номер мобільного телефону";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.error.m_b-5")));
        Assert.assertTrue(forgotPasswordPage.isErrorVisible(), "Error block did not appear");
        Assert.assertEquals(forgotPasswordPage.getErrorText(), expected, "The error text did not match");
    }
}
