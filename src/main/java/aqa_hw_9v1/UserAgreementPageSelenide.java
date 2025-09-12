package aqa_hw_9v1;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;

public class UserAgreementPageSelenide {

    public String getH1() {
        return $("h1.title-page")
                .shouldBe(visible)
                .getText()
                .trim();
    }

    public void clickDisposition() {
        $("a[href*='/page/disposition/']")
                .shouldBe(visible, enabled)
                .click();
    }
}
