package aqa_hw_9v1;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class HomePageSelenide {

    private final SelenideElement userIcon = $("a.user-button.login-button.header__user-icon");
    private final SelenideElement registerLink = $("a[href='/ua/register/']");
    private final SelenideElement searchInput = $("input.search__input");         // поле поиска
    private final SelenideElement searchButton = $("button.search__button");        // кнопка поиска

    public void enterSearchText(String text) {
        searchInput.shouldBe(visible, enabled)
                .setValue(text);
    }

    public void clickOnSearchButton() {
        searchButton.shouldBe(visible, enabled).click();
    }

    public void clickUserIcon() {
        userIcon.scrollTo().shouldBe(visible, enabled);
        try {
            userIcon.click();
        } catch (Throwable ignore) {
            userIcon.click(ClickOptions.usingJavaScript());
        }
    }

    public void goToRegisterPage() {
        clickUserIcon();
        registerLink.shouldBe(visible, enabled).click();

    }

    public void goToLoginPage() {
        clickUserIcon();

    }
}
