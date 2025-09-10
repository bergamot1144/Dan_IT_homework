package aqa_hw_9;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {

    private final SelenideElement nameField = $("#name");

    public void typeName(String name) {
        nameField.setValue(name);
    }
    public String getNameValue() {
        return nameField.getValue();
    }
    public int getNameLength() {
        return getNameValue().length();
    }
}
