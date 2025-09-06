package aqa_hw_8;

import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class VerifyForgetPasswordWrongInputTest extends BaseTest {

    @Test
    public void verifySearchWorkingCorrectly() throws InterruptedException {

        HomePage home = new HomePage(getDriver());
        home.goToLoginPage();
        sleep(3000);
        LoginPage login = new LoginPage(getDriver());
        login.clickForgetPassword();
        ForgotPasswordPage fp = new ForgotPasswordPage(getDriver());
        fp.typeLogin("qwerty!@#not-an-email");
        fp.clickSendButton();
        String expected = "Введіть коректний email або номер мобільного телефону";
        Assert.assertTrue(fp.isErrorVisible(), "Блок ошибки не появился");
        Assert.assertEquals(fp.getErrorText(), expected, "Текст ошибки не совпал");
    }
}
