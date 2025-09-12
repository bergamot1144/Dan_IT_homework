package aqa_hw_9v1;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Condition.*;

public class LoginPageSelenide {

    public LoginPageSelenide enterLogin(String login) {
        $("[inputmode='email']").shouldBe(visible, enabled).setValue(login);
        return this;
    }

    public LoginPageSelenide enterPassword(String password) {
        $("[type='password']").shouldBe(visible, enabled).setValue(password);
        return this;
    }

    public void clickUserAgreement() {
        $("a[href='/ua/page/user_agreement/'], a[href='/page/user_agreement/']")
                .shouldBe(visible).click();
    }

    public void clickDisposition() {
        $("a[href='/ua/page/disposition/']").shouldBe(visible).click();
    }

    public void clickLoginButton() {
        $("[type='submit']").shouldBe(enabled).click();
    }

    public void clickForgetPassword() {
        $("a[href='/ua/reminder/']").shouldBe(visible).click();
    }

    public void clickRegisterLink() {
        $("a[href='/ua/register/']").shouldBe(visible).click();
    }

    public void switchToNewTab() {
        switchTo().window(1);
    }
}
