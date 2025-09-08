package aqa_hw_9;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ForgotPasswordPage {

    private final SelenideElement loginInput = $("input[type='text'], input[type='email']");
    private final SelenideElement sendButton = $("button.reminder-form__button");
    private final SelenideElement errorBlock = $("div.error.m_b-5");

    public void typeLogin(String value) {
        loginInput.clear();
        loginInput.setValue(value);
    }

    public void clickSendButton() {
        sendButton.click();
    }

    public boolean isErrorVisible() {
        return errorBlock.exists() && errorBlock.isDisplayed();
    }

    public String getErrorText() {
        return errorBlock.getText().trim();
    }
}
