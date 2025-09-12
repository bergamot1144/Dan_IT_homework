package aqa_hw9v1;

import aqa_hw_9v1.ForgotPasswordPageSelenide;
import aqa_hw_9v1.HomePageSelenide;
import aqa_hw_9v1.LoginPageSelenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverConditions.urlContaining;
import static com.codeborne.selenide.Selenide.webdriver;

public class VerifyForgetPasswordWrongInputTestSelenide extends BaseTest {

    @Test
    public void verifyForgetPasswordWrongInput() {
        new HomePageSelenide().goToLoginPage();
        new LoginPageSelenide().clickForgetPassword();
        webdriver().shouldHave(urlContaining("/ua/reminder/"));
        ForgotPasswordPageSelenide fp = new ForgotPasswordPageSelenide();
        fp.typeLogin("qwerty!@#not-an-email");
        fp.clickSendButton();
        fp.checkErrorVisible();
        String expected = "Введіть коректний email або номер мобільного телефону";
        String actual = fp.getErrorText();
        Assert.assertEquals(actual, expected, "Текст ошибки не совпал");
    }
}
