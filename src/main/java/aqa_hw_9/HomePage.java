package aqa_hw_9;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private final SelenideElement searchField = $("[type='text']");
    private final SelenideElement searchButton = $("button.search__btn");
    private final SelenideElement userIcon = $("a.user-button.login-button.login-button--visible.header__user-icon");
    private final SelenideElement registerLink = $("a[href='/ua/register/']");

    public void clickUserIcon() {
        userIcon.click();
    }
    public void goToRegisterPage() {
        clickUserIcon();
        registerLink.click();
    }
    public void goToLoginPage() {
        clickUserIcon();
    }
}
