package aqa_hw_9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyForgetPasswordWrongInputTest extends BaseTest {

    @Test
    public void verifyForgetPasswordWrongInput() {
        HomePage home = new HomePage();
        home.goToLoginPage();
        LoginPage login = new LoginPage();
        login.clickForgetPassword();
        ForgotPasswordPage fp = new ForgotPasswordPage();
        fp.typeLogin("qwerty!@#not-an-email");
        fp.clickSendButton();
        String expected = "Введіть коректний email або номер мобільного телефону";
        Assert.assertTrue(fp.isErrorVisible(), "Блок ошибки не появился");
        Assert.assertEquals(fp.getErrorText(), expected, "Текст ошибки не совпал");
    }
}
