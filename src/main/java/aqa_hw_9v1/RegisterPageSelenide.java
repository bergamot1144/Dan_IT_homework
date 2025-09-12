package aqa_hw_9v1;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;

public class RegisterPageSelenide {

    private final String nameSelector = "#name";

    public void typeName(String name) {
        $(nameSelector)
                .shouldBe(visible, enabled)
                .setValue(name);
    }

    public String getNameValue() {
        return $(nameSelector)
                .shouldBe(visible)
                .getValue();
    }

    public int getNameLength() {
        return getNameValue().length();
    }
}
