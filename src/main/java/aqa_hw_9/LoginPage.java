package aqa_hw_9;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class LoginPage {


    private final SelenideElement loginField = $("[inputmode='email']");
    private final SelenideElement passwordField = $("[type='password']");
    private final SelenideElement dispositionLink = $("a[href='/ua/page/disposition/']");
    private final SelenideElement loginButton = $("[type='submit']");
    private final SelenideElement forgetPasswordLink = $("a[href='/ua/reminder/']");
    private final SelenideElement userAgreementLink = $("a[href='/ua/page/user_agreement/'], a[href='/page/user_agreement/']");
    private final SelenideElement registerLink = $("a[href='/ua/register/']");

    public void clickUserAgreement() {
        userAgreementLink.click();
    }

    public void clickForgetPassword() {
        forgetPasswordLink.click();
    }
}
