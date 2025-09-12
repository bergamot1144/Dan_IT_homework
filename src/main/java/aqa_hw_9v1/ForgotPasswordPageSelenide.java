package aqa_hw_9v1;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;

public class ForgotPasswordPageSelenide {

    public void typeLogin(String value) {
        $("input[type='text'], input[type='email']")
                .shouldBe(visible)
                .setValue(value);
    }

    public void clickSendButton() {
        $("button.reminder-form__button")
                .shouldBe(enabled) // дождётся, что кнопка кликабельна
                .click();
    }

    public void checkErrorVisible() {
        $("div.error.m_b-5").shouldBe(visible);
    }

    public String getErrorText() {
        return $("div.error.m_b-5")
                .shouldBe(visible)
                .getText().trim();
    }
}
